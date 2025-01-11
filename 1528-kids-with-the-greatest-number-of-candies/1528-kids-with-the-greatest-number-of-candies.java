class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int t) {
        long max = 0;
        List<Boolean> list = new ArrayList<>();
        for(int candy : candies){
            max = Math.max(max,candy);
        }
        for(int candy : candies){
            list.add(candy + t >= max);
        }
        return list;
    }
}