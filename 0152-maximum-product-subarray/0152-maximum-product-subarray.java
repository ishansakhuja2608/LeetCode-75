class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int imax = nums[0]; // stores the max prod till nums[i]
        int imin = nums[0]; // stores the min prod till nums[i]
        
        for(int i = 1; i < nums.length; i++) {
            // big number multiplied by neg, makes it smaller and VV, therefore we swap both
            if(nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            
            // Updating the values
            imax = Math.max(nums[i] * imax, nums[i]);
            imin = Math.min(nums[i] * imin, nums[i]);
            
            res = Math.max(res, imax);
        }
        return res;
    }
}