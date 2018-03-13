var deletebtn = document.getElementById("delete");
deletebtn.addEventListener("click", function () {
    var num = String(addVue.id);
    var ourRequest = new XMLHttpRequest();
    ourRequest.open('DELETE', '/tops/delete/' + num);
    ourRequest.onload = function () {
    };
    ourRequest.send();
    alert(num);
    console.log(num);
});