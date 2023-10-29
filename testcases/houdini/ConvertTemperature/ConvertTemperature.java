class ConvertTemperature {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }

    public void __HoudiniInvoker() {
        convertTemperature(-2);
        convertTemperature(-1);
        convertTemperature(0);
        convertTemperature(1);
        convertTemperature(2);
    }
}
