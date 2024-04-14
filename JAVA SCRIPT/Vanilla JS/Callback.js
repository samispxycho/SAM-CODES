function sum(a,b){
    console.log(a+b);
}

function calculator(a,b,sumCallback){
    sumCallback(a,b);
}
calculator(10,20,sum);  

//----------------------------------------------------------------------------------------------------------------------------//

//Problem of callback hell
function getData(idnum,getNext){
    setTimeout(function(){
        console.log("data of",idnum);
        if(getNext){
            getNext();
        }
    },2000);
}

getData(1, ()=>{
    getData(2, ()=>{
        getData(3, ()=>{
            getData(4);
        });
    });
});                 //nested callback-->callback hell or pyramid of doom

