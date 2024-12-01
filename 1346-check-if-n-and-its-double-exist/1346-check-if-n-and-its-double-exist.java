class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer> l= new ArrayList<>();
        Set<Integer> s= new HashSet<>();
        for(int i: arr){
            l.add(i);
            s.add(i);
        }
        for(int i: s) {
            if(i==0){
                if(Collections.frequency(l, 0)>1) return true;
                continue;
            }
            if(s.contains(i*2)) return true;
        }
        return false;
    }
}