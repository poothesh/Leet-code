class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()>prices[i]){
                s.pop();
            }
            int dis = !s.isEmpty()?s.peek():0;
            ans[i] = prices[i]-dis;
            s.push(prices[i]);
        }
        return ans;
    }
}