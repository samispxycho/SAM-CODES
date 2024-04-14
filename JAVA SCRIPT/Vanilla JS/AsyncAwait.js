//Async method
async function hello(){
    console.log("Hello");
}
hello();

//---------------------------------------------------------------------------------------------------------------------//

function api(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Weather data");
            resolve(200);
        },3000);
    });
}

async function getWeather(){
    await api();
    await api();
}

getWeather();

//-----------------------------------------------------------------------------------------------------------------------//

function getD(idnum){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Data of",idnum);
            resolve(200);
        },3000);
    });
}

async function printD(){
    await getD(1);
    await getD(2);
    await getD(3);
    await getD(4);
}

(async function printD2(){                  //using iife
    await getD(1);
    await getD(2);
    await getD(3);
    await getD(4);
})();


//-------------------------------------------------------------------------------------------------------------------------//