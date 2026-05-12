class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            Integer mapIndex = map.get(nums[i]);
            if(mapIndex != null) {
                return new int[]{Math.min(i, mapIndex), Math.max(i, mapIndex)};
            }
            map.put(target - nums[i], i);
        }

        return nums;
    }
}
