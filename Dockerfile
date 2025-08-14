# syntax=docker/dockerfile:1.4
FROM openjdk:21-jdk-bookworm AS builder
WORKDIR /app

# Gradle依存関係だけ先にコピー
COPY build.gradle.kts settings.gradle.kts gradlew ./
COPY gradle ./gradle
COPY buildSrc ./buildSrc
COPY kotlin-js-store ./kotlin-js-store

RUN --mount=type=cache,target=/root/.gradle \
    ./gradlew dependencies --no-daemon || return 0

COPY src ./src

RUN --mount=type=cache,target=/root/.gradle \
    ./gradlew build --no-daemon


FROM nginx AS runner
ENV SERVER_NAME _
ENV PORT 80
EXPOSE $PORT
COPY --from=builder /app/build/dist/js/productionExecutable/  /usr/share/nginx/html
COPY docker/default.conf.template /etc/nginx/conf.d/
COPY docker/entrypoint.sh /
ENTRYPOINT ["/entrypoint.sh"]
CMD ["nginx", "-g", "daemon off;"]