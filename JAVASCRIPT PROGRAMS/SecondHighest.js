function secondMax(arr){
    let max = -Infinity;
    let smax = -Infinity;

    for(let ele of arr){
        if(ele > max){
            smax = max;
            max = ele;
        }else if(ele > smax && ele!=max){
            smax = ele;
        }
    }

    console.log(smax);
}

let arr = [37, 10, 25, 40, 15, 28];
secondMax(arr);