class Solution {
    public double[] convertTemperature(double c) {
        double[] arr = new double[2];
        arr[0] = c + 273.15;
        arr[1] = c * 1.80 + 32.00;
        return arr;
    }
}