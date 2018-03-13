var update = document.getElementById("update");
update.addEventListener("click", function () {
    var event = {
        id: addVue.id,
        name: addVue.name,
        description: addVue.description
    };
    var ourRequest = new XMLHttpRequest();
    var str = JSON.stringify(event);
    ourRequest.open('PUT', '/tops/update');
    ourRequest.setRequestHeader('Content-Type', 'application/json');
    ourRequest.onload = function () {
    };
    ourRequest.send(str);
    alert(str);
});