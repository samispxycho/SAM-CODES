var b1=document.querySelector("#b1");
b1.onclick=()=>{
    console.log("External event handling");
}

var b2=document.querySelector("#b2");
b2.ondblclick=()=>{
    console.log("This was double clicked");
}

var dIv=document.querySelector("#dIv");
dIv.onmouseover=()=>{
    console.log("Mouse hovering");
}

dIv.onmouseout=()=>{
    console.log("Mouse pulled");
}