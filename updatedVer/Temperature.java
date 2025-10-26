package task3.updatedVer;
//extract superclass
abstract class Temperature {
    protected double temperature;
    protected String unit;

    public Temperature(double temperature, String unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public abstract void displayResults();
}
