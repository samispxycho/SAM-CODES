//Fetch elements using methods

//getElementById
var eId=document.getElementById("one");
console.log(eId);

//getElementByClass
var eClass=document.getElementsByClassName("two");
console.log(eClass);

//getElementByTagName
var tname=document.getElementsByTagName("h2");

//for any element
var rele=document.querySelector("#three");
console.log(rele);
var rele2=document.querySelectorAll("#three");
console.log(rele2);

//------------------------------------------------------------------------------------------------------//


//Using JS properties that can acess or manipulate the elements

//tagName: returns the name of the tag
var firstEle=document.getElementById("head3");
console.log(firstEle.tagName);

//innerText: returns the text content of the element
var secondEle=document.querySelector("#div1");
console.log(secondEle.innerText);
console.log(secondEle.innerText="changed data");                        //can be use to change the data

//innerHTML: in addition, it also returns the tag details
var thirdEle=document.querySelector("#div2");
console.log(thirdEle.innerHTML);
console.log(thirdEle.innerHTML="<i>should be in italics</i>");          //with innerHTML we can provide tags

//Children properties
var fourthEle=document.querySelector("#div3");
console.log(fourthEle.firstChild);
console.log(fourthEle.lastChild);
console.log(fourthEle.children[0]);
console.log(fourthEle.children[1]);


//------------------------------------------------------------------------------------------------------//

//Ques: append a text to an old text
var p=document.getElementById("put");
p.innerText=p.innerText+" from Apna college";
console.log(p.innerText);
