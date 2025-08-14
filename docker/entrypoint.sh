#!/usr/bin/env sh
set -eu
# 置換したい変数名を限定して envsubst
envsubst '${PORT} ${SERVER_NAME}' \
  < /etc/nginx/conf.d/default.conf.template \
  > /etc/nginx/conf.d/default.conf
exec "$@"
