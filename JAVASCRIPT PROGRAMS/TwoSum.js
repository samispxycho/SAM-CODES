function twoSum(nums, target) {
    const map = new Map();

    for (let i = 0; i < nums.length; i++) {
        let diff = target - nums[i];

        if (map.has(diff)) {
            return [map.get(diff), i];
        }

        map.set(nums[i], i);
    }
}

let nums = [10, 5, 2, 15, 20];
let target = 7;

let result = twoSum(nums, target);
console.log(result);