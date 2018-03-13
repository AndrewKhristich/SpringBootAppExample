var ourRequest = new XMLHttpRequest();
ourRequest.open('GET', '/tops');
ourRequest.setRequestHeader('Content-Type', 'application/json');
ourRequest.onload = function () {
    var data = JSON.parse(ourRequest.responseText);

    var vm = new Vue({
        el: "#table",
        data: {
            arrays: data
        }
    });
};
ourRequest.send();