class Solution {
    public int removeDuplicates(int[] nums) {
        //Slow and Fast Approach O(n) and O(1)
        if (nums == null || nums.length == 0) return 0;
        
        int slow = 0;
        for(int fast=1; fast < nums.length; fast++) {
            if(nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;



        //O(n)
        //O(1)
        /** 
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        */
    }
}