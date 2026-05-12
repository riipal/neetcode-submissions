class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length <= 0) return new ArrayList();

        HashMap<String, List> hm = new HashMap<>();

        int[] counts = new int[26];

        for(String s: strs) {
            Arrays.fill(counts, 0);
            for(char c: s.toCharArray()) {
                counts[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(counts[i]);
            }

            String key = sb.toString();

            if(!hm.containsKey(key)) {
                hm.put(key, new ArrayList());
            }
            hm.get(key).add(s);
        }

        return new ArrayList(hm.values());
    }
}
