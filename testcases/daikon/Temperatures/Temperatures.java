class Temperatures {
    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius, celsius + 273.15, celsius * 1.80 + 32.00};
    }

    public static void main(String[] args) {
        convertTemperature(-2);
        convertTemperature(-1);
        convertTemperature(0);
        convertTemperature(1);
        convertTemperature(2);
        convertTemperature(3);
        convertTemperature(5);
        convertTemperature(114);
    }
}
