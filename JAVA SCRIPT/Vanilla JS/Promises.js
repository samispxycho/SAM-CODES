//creating a promise
var promise = new Promise((resolve,reject)=>{
    console.log("I am a promise");
})

//--------------------------------------------------------------------------------------------------------------------//

//3 STATES OF PROMISES

//1: Pending state-neither fulfilled nor rejected
var p1=new Promise((resolve,reject)=>{
    console.log("I am a promise of pending state");
})

//2: Fulfilled state-operation completed
var p2=new Promise((resolve,reject)=>{
    console.log("I am a promise of fulfilled state");
    resolve("Promise fulfilled");
});

//3: Rejected state-operation failed
var p3=new Promise((resolve,reject)=>{
    console.log("I am a promise of rejected state");
    reject("Promise rejected");
});

//-----------------------------------------------------------------------------------------------------------------------------//

//then and catch methods

function getData1(){
    return new Promise((resolve,reject)=>{
        console.log("Data sucessfully fetched");
        resolve("Success");
    });
}
var details1=getData1();
details1.then(()=>{
    console.log("Promise fulfilled");
});                                 

var getData2=function(){
    return new Promise((resolve,reject)=>{
        console.log("Some error occured");
        reject("Failed");
    });
}
var details2=getData2();
details2.catch(()=>{
    console.log("Promise broked");
})

//------------------------------------------------------------------------------------------------------------------------------------//

// Promise chaining

function GetD1(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Data one");
            resolve("Sucess");
        },4000);
    })
}

function GetD2(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Data two");
            resolve("Success");
        },4000);
    })
}

function GetD3(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Data three");
            reject("Error");
        },4000);
    })
}

function GetD4(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Data four");
            reject("Error");
        },4000);
    })
}

console.log("Fetching data 1");
let promise1=GetD1();
promise1.then(()=>{
    console.log("Fetching data 2");
    let promise2=GetD2();
    promise2.then(()=>{
        console.log("Fetching data 3");
        let promise3=GetD3();
        promise3.then(()=>{
            console.log("Fetching data 4");
        });
    });
});

//----------------------------------------------------------------------------------------------------------------------------------------//

//Problem of callback hell solved

function getD(idnum){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Data of",idnum);
            resolve("Sucess");
        },3000);
    });
}

getD(1).then(()=>{
    getD(2).then(()=>{
        getD(3);
    });
});