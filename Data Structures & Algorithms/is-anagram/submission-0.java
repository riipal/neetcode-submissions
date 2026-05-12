class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = s.toLowerCase();
        String s2 = t.toLowerCase();

        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        int[] count = new int[26];

        for(int i=0; i<s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }

        for(int i=0; i<s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }

        for(int counts: count) {
            if(counts != 0) {
                return false;
            }
        }
        return true;
        


    }
}
