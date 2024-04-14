//A normal method
function myFunc(){
    console.log("This is a normal function");
}
myFunc();

//We can give variables to out functions
var minus=function minusKrdo(a,b){
    return a-b;
}
var result=minus(10,20);
console.log(result);

//--------------------------------------------------------------------------------------------------------------------------------//

//Higher Order Functions
function abc(){
    console.log("Hello");
}
function myFunction(func){
    return func;
}
console.log(myFunction(abc()));

//----------------------------------------------------------------------------------------------------------------------------------//

//Anonymous functions
var dikhao= function(){
    console.log("Hello this is anonymous method");
}
dikhao();

//Anonymous functions are often used with high order functions, such as setTimeout
setTimeout(function(){
    console.log("Hello this is setTimeout method");
},1000);

//-------------------------------------------------------------------------------------------------------------------------------------//

//Arrow functions               
var ans=()=>{
    console.log("This is a part of arrow function");
}
ans();

//can take parameters too
var ans2=(a,b)=>{
    console.log(a*b);
}
ans2(10,10);

//-----------------------------------------------------------------------------------------------------------------------------------------//

//Immediately invoked function expression
(function bye(){
    console.log("bye bye");
    console.log("bye bye");
    console.log("bye bye");
    console.log("bye bye");
    console.log("bye bye");
})();
