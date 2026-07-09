/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function (nums) {
    //find the pivot point
    //[1,3,5,4,2]
    let len=nums.length
    let i = len - 2;//3=>2=>1
    while (nums[i] >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    } //4>=2 true

    //find the successors
    if (i >= 0) {
        let j = len - 1;//4=>3
        while (nums[j] <= nums[i]) { //3<2=>3<4 false
            j--;
        }
        [nums[i], nums[j]] = [nums[j], nums[i]];
    }


    let left = i + 1;//1+1=2
    let right = len - 1;//4
    while (left < right) {
            [nums[left], nums[right]] = [nums[right], nums[left]];
            left++;
            right--;
    
    }
};