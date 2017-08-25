const http = require('http');

let counter = 0;
http.createServer((req, res) => {
  res.end(JSON.stringify({counter: ++counter, pid: process.pid}));
}).listen(9999);
