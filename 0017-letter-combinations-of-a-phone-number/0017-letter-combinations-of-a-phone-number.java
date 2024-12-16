class Solution {
    String[] codes  = {"" , "", "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"} ; 
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0 ){
              List<String> bres = new ArrayList<>() ;
            return bres ; 
        }
           List<String> ans =  helper(digits) ; 
           return ans ; 
    }
    public List<String> helper(String digits){
        if(digits.length() == 0 ){
            List<String> bres = new ArrayList<>() ;
            bres.add("") ;
            return bres ; 
        }
        char ch = digits.charAt(0) ; 
        String ros = digits.substring(1) ; 
        int idx = ch - '0' ; 
        List<String> recAns = helper(ros) ; 
        List<String> myAns = new ArrayList<>() ; 
        for(int i = 0 ; i < codes[idx].length() ; i++){ // iterating on jkl
            char ch1 = codes[idx].charAt(i) ; 
            for(String s : recAns){
                myAns.add(ch1 + s) ; 
            }
        } 
        return myAns ; 
    }
}