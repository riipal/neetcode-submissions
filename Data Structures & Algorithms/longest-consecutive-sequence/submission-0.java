class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int num : nums) {
            uniqueNumbers.add(num);
        }

        int maxLengthSeq = 0;
        for(int uniqueNumber : uniqueNumbers) {
            if(!uniqueNumbers.contains(uniqueNumber - 1)) {
                int currentLengthSeq = 1;
                while(uniqueNumbers.contains(uniqueNumber + 1)) {
                    uniqueNumber++;
                    currentLengthSeq++;
                }
                maxLengthSeq = Math.max(maxLengthSeq, currentLengthSeq);
            }
        }
        return maxLengthSeq;
    }
}

 

