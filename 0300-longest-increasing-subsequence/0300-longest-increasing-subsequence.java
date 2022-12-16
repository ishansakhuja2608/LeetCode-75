class Solution {
    public int maxLen(int index, int prevIndex, int[] nums, int[][] dp) {
        if(index == nums.length) {
            return 0;
        }
        if(dp[index][prevIndex + 1] != -1) {
            return dp[index][prevIndex + 1];
        }
        int notTake = 0 + maxLen(index + 1, prevIndex, nums, dp);
        int take = 0;
        if(prevIndex == -1 || nums[index] > nums[prevIndex]) {
            take = maxLen(index + 1, index, nums, dp) + 1;
        }
        return dp[index][prevIndex + 1] = Math.max(take, notTake);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for(int[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        return maxLen(0, -1, nums, dp);
    }
}