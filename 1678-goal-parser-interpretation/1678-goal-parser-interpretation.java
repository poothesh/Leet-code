class Solution {
    public String interpret(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); ) {
            if (str.charAt(i) == 'G') {
                result.append('G');
                i++;
            } else if (str.charAt(i) == '(' && str.charAt(i + 1) == ')') {
                result.append('o');
                i += 2;
            } else if (str.charAt(i) == '(' && str.substring(i, i + 4).equals("(al)")) {
                result.append("al");
                i += 4;
            }
        }

        return result.toString();
    }
}
