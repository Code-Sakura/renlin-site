// publicPath をルートに
config.output = config.output || {};
config.output.publicPath = '/';

// historyApiFallback の設定
config.devServer = config.devServer || {};
config.devServer.historyApiFallback = {
  disableDotRule: true,
  rewrites: [
    {from: /^\/.*$/, to: '/index.html'}
  ],
};
