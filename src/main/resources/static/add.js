var addVue = new Vue({
    el: "#add",
    data: {
        id: null,
        name: null,
        description: null
    }
});

var btn = document.getElementById("commit");
btn.addEventListener("click", function () {
    var event = {
        id: addVue.id,
        name: addVue.name,
        description: addVue.description
    };
    var ourRequest = new XMLHttpRequest();
    var str = JSON.stringify(event);
    ourRequest.open('POST', 'tops/save');
    ourRequest.setRequestHeader('Content-Type', 'application/json');
    // ourRequest.onload = function () {};
    ourRequest.send(str);
    alert(str);
});