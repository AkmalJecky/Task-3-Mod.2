package task3.before;

public class TemperatureConverter {
    public double temp;
    public String unit;

    public TemperatureConverter(double t, String u) {
        temp = t;
        unit = u;
    }

    public void convert() {
        if (unit.equals("C")) {
            double f = (temp * 9 / 5) + 32;
            double k = temp + 273.15;
            System.out.println("Fahrenheit: " + f);
            System.out.println("Kelvin: " + k);
        } else if (unit.equals("F")) {
            double c = (temp - 32) * 5 / 9;
            double k = (temp - 32) * 5 / 9 + 273.15;
            System.out.println("Celsius: " + c);
            System.out.println("Kelvin: " + k);
        } else {
            double c = temp - 273.15;
            double f = (temp - 273.15) * 9 / 5 + 32;
            System.out.println("Celsius: " + c);
            System.out.println("Fahrenheit: " + f);
        }
    }

    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter(100, "C");
        t.convert();
    }
}