class ConvertTemperature {
    //@ ensures \result != null;
    //@ ensures 2 <= \result.length;
    //@ ensures 2 == \result.length;
    //@ ensures 2 >= \result.length;
    //@ ensures 1 < \result.length;
    //@ ensures 1 <= \result.length;
    //@ ensures 1 != \result.length;
    //@ ensures -1 < \result.length;
    //@ ensures -1 <= \result.length;
    //@ ensures -1 != \result.length;
    //@ ensures \fresh(\result);
    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }

    //@ requires \nonnullelements(args);
    public static void main(String[] args) {
        convertTemperature(-2);
        convertTemperature(-1);
        convertTemperature(0);
        convertTemperature(1);
        convertTemperature(2);
    }
}
