class Solution {
    public static int find(String word, char[] ch) {
        int count = 0;
        char[] chStr = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < chStr.length; j++) {
                if (ch[i] == chStr[j]) {
                    count++;
                }
            }
        }
        if (count == chStr.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public int countConsistentStrings(String str, String[] words) {
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < words.length; i++) {
            count += find(words[i], ch);
        }
        return count;
    }
}
