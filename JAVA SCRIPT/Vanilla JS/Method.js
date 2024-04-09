function myFunc(){
    console.log("This is a normal function");
}
myFunc();

function add(a,b){
    console.log(a+b);
}
var a=parseInt(prompt("Enter first number"));
var b=parseInt(prompt("Enter second number"));
add(a,b);


//Arrow functions
const sum=(a,b)=>{
    document.write(a+b);
}
sum(10,20);


//Higher Order Functions
function abc(){
    console.log("Hello");
}
function myFunction(func){
    return func;
}
console.log(myFunction(abc()));


//forEach method
var arr=[10,20,30,40,50];

function square(ele){
    document.write(ele*ele+"</br>");
}
arr.forEach(square);
