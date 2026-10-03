// Running Sum of 1d Array
// Given an array nums, define the running sum of nums as
// runningSum[i] = sum of nums[0] through nums[i].
// Return the running sum of nums.

class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}