var express = require("express");
var bodyParser = require("body-parser");
var app = express();
 
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
 
var server = app.listen(50001, function () {
    console.log("Listening on port %s...", server.address().port);
});

app.get("/", function(req, rsp) {
  rsp.status(205).send("");
});
