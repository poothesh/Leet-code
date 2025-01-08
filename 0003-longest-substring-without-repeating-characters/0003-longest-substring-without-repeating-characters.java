class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0) {
            return 0;
        }

        ArrayList<String> longestSubStrings = new ArrayList<String>();
        ArrayList<Character> currentStringChars = new ArrayList<Character>();
        String stringBuilder = "";
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(!currentStringChars.contains(currentChar)) {
                currentStringChars.add(currentChar);
                stringBuilder += currentChar;
            } else {
                while(s.charAt(i - 1) != currentChar) {
                    i--;
                }
                i--;
                longestSubStrings.add(stringBuilder);
                currentStringChars.clear();
                stringBuilder = "";
            }
        }
        longestSubStrings.add(stringBuilder);
        int longestSubstringLength = 0;
        for (String string : longestSubStrings) {
            if (string.length() > longestSubstringLength) {
                longestSubstringLength = string.length();
            }
        }
        return longestSubstringLength;
    }
}