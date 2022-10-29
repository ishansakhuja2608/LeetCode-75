class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = 0;
        int res = nums[0];
        for(int i = 0; i < nums.length; i++) {
            maxi += nums[i];
            if(maxi > res) {
                res = maxi;
            }
            if(maxi < 0) {
                maxi = 0;
            }
        }
        return res;
    }
}