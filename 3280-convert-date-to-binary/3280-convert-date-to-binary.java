class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");

        for(int i=0; i<arr.length; i++){
            String bin = Integer.toBinaryString(Integer.parseInt(arr[i]));
            arr[i] = bin;
        }

        return String.join("-", arr);
    }
}