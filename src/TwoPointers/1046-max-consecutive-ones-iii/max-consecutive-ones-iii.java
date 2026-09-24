class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int left = 0;
        int right = 0;

        int zeroes = 0;
        int maxLen = 0;

        while (right < n) {

            // Add the new element to the window
            if (nums[right] == 0) {
                zeroes++;
            }

            // Shrink the window if it becomes invalid
            while (zeroes > k) {
                if (nums[left] == 0) {
                    zeroes--;
                }
                left++;
            }

            // Current window is valid
            maxLen = Math.max(maxLen, right - left + 1);

            right++;
        }

        return maxLen;
    }
}