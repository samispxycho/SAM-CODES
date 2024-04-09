/*
//Printing
document.write("Hello world");  //for web page
console.log("Hello JS World");  //for console screen


//Popup Boxes
alert("Java Script");
confirm("Order placed");
prompt("Enter your name: ");


//Declaring a variable
var fullName="sameer";
document.write(fullName);
let age=40;
document.write(age);
const PI=3.14;
document.write(PI);


//var is a global scoped keyword
var a=10;
{
    var a="hello";
    console.log(a);
}
console.log(a);


//let is a block scoped variable
let b = 10;
{
    let b="hello";
    console.log(b);
}
console.log(b);
*/

//DataTypes
var num=100;
var fullname="sameer";
var isGreat=true;
var x;
var b=null;
var bignum=BigInt(100);
var sym=Symbol("abc");


//To print the type of datatype
console.log(typeof num);
console.log(typeof fullname);