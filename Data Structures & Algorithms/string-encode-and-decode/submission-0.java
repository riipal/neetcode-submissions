class Solution {

    /**
     * Encodes a list of strings to a single string.
     * Format: For each string, append "length#string"
     * Example: ["abc", "def"] -> "3#abc3#def"
     *
     * @param strs List of strings to encode
     * @return Encoded single string
     */
    public String encode(List<String> strs) {
         StringBuilder sb = new StringBuilder();

         for(String str : strs) {
            sb.append(str.length()).append('#').append(str);
         }

         return sb.toString();
    }

    /**
     * Decodes a single string to a list of strings.
     * Parses the format "length#string" for each encoded string
     *
     * @param s Encoded string to decode
     * @return List of decoded strings
     */
    public List<String> decode(String str) {
       List<String> res = new ArrayList<String>();
       int currentIndex = 0;
       int totalLength = str.length();

       while (currentIndex < totalLength) {
            // Find the delimiter '#' to extract the length
            int delimiterIndex = str.indexOf('#', currentIndex);

            // Parse the length value
            int stringLength = Integer.parseInt(str.substring(currentIndex, delimiterIndex));

            // Extract the string based on its length
            int startIndex = delimiterIndex + 1;
            int endIndex = startIndex + stringLength;
            res.add(str.substring(startIndex, endIndex));

            // Move to the next encoded string
            currentIndex = endIndex;
       }
       return res;
    }
}
