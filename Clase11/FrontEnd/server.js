const express = require('express');

const app = express();

const path = require('path');

const router = express.Router();


router.get('/' , function(req, res) {
    res.sendFile(path.join(__dirname + '/index.html'));
});

app.use('/front', express.static(path.join(__dirname, '')))

app.use('/', router);
app.listen(3000);
console.log("Server Front is Running")