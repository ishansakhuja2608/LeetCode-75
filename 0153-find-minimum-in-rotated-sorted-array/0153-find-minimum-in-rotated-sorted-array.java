class Solution {
    public int findMin(int[] nums) {
        int index = -1;
        for(int i = 0; i< nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                index = i;
            }
        }
        if(index != -1) {
            return nums[index + 1];
        }
        return nums[0];
    }
}