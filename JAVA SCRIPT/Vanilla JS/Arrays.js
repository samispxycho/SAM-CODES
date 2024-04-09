//Methods to declare
var arr1=[1,2,3];
var arr2=new Array();
arr2[0]=4;
arr2[1]=5;
arr2[2]=6;
var arr3=new Array(7,8,9);


//Printing the elements;
console.log(arr1[1]);

for(var i=0;i<arr2.length;i++){
    console.log(arr2[i]);
}

for(var ele of arr3){
    console.log(ele);
}


//Properties And Methods
var arr=[1,2,3,4,5,6,7];
var arr2=[8,9,10];
document.write(arr + "</br>");
document.write(arr.length + "</br>");
arr.push(8)
document.write(arr + "</br>");
arr.pop();
document.write(arr + "</br>");
document.write(typeof arr.toString() + "</br>");
document.write(arr.concat(arr2) + "</br>");
arr.unshift(101);
document.write(arr + "</br>");
arr.shift();
document.write(arr + "</br>");

var arr4=[10,20,30,40,50,60,70,80,90];
document.write(arr4.slice(2,5) + "</br>");
arr4.splice(2,2,100,200);
document.write(arr4);




