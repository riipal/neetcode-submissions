class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int left = 0, right = 0; right < n; right++) {
            char curr = s.charAt(right);
            if(map.containsKey(curr)) {
                left = Math.max(map.get(curr)+ 1, left);
            }
            map.put(curr, right);

            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
