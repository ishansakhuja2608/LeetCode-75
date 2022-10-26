class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        
        int leftProd = 1;
        for(int i = 0; i < n; i++) {
            leftProd *= nums[i];
            left[i] = leftProd;
        }
        
        int rightProd = 1;
        for(int i = n - 1; i >= 0; i--) {
            rightProd *= nums[i];
            right[i] = rightProd;
        }
        
        for(int i = 0; i < n; i++) {
            int leftSide = i >= 1 ? left[i - 1] : 1;
            int rightSide = i < n - 1 ? right[i + 1] : 1;
            res[i] = leftSide * rightSide;
        } 
        return res;
    }
}
