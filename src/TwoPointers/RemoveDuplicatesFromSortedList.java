/*
LeetCode 26: Remove Duplicates from Sorted Array

Given a sorted integer array nums, remove the duplicates in-place so that
each unique element appears only once.

Return the number of unique elements k. The first k elements of nums should
contain the unique elements in sorted order.

Example:
Input:  [0,0,1,1,1,2,2,3,3,4]
Output: 5
nums:   [0,1,2,3,4,...]
*/

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}