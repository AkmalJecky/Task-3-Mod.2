package task3.updatedVer;

//magic number
class TemperatureConverter extends Temperature implements Convertible {
    private static final double NINE = 9.0;
    private static final double FIVE = 5.0;
    private static final double THIRTY_TWO = 32.0;
    private static final double KELVIN_OFFSET = 273.15;


    public TemperatureConverter(double temperature, String unit) {
        super(temperature, unit.toUpperCase());
        validateUnit(); //add validate
    }
    private void validateUnit() {
        if (!unit.equals("C") && !unit.equals("F") && !unit.equals("K")) {
            throw new IllegalArgumentException(
                    "Invalid temperature unit. Please use 'C' for Celsius, 'F' for Fahrenheit, or 'K' for Kelvin."
            );
        }
    }
    // 4. Extract Method (pisahkan perhitungan dari tampilan)
    private double toCelsius() {
        if (unit.equalsIgnoreCase("C")) return temperature;
        else if (unit.equalsIgnoreCase("F")) return (temperature - THIRTY_TWO) * FIVE / NINE;
        else return temperature - KELVIN_OFFSET;
    }

    private double toFahrenheit() {
        if (unit.equalsIgnoreCase("C")) return (temperature * NINE / FIVE) + THIRTY_TWO;
        else if (unit.equalsIgnoreCase("F")) return temperature;
        else return (temperature - KELVIN_OFFSET) * NINE / FIVE + THIRTY_TWO;
    }

    private double toKelvin() {
        if (unit.equalsIgnoreCase("C")) return temperature + KELVIN_OFFSET;
        else if (unit.equalsIgnoreCase("F")) return (temperature - THIRTY_TWO) * FIVE / NINE + KELVIN_OFFSET;
        else return temperature;
    }

    private double toRankine() {
        if (unit.equals("C")) return (temperature + KELVIN_OFFSET) * NINE / FIVE;
        else if (unit.equals("F")) return temperature + 459.67;
        else return temperature * NINE / FIVE; // dari Kelvin
    }

    // 5. Encapsulate Field (getter)
    public double getTemperature() {
        return temperature;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public void convert() {
        displayResults();
    }

    // 6. Inline Variable (hapus variabel sementara, langsung gunakan ekspresi)
    @Override
    public void displayResults() {
        System.out.println("Temperature Input: " + temperature + "°" + unit.toUpperCase());
        System.out.println("Celsius: " + toCelsius());
        System.out.println("Fahrenheit: " + toFahrenheit());
        System.out.println("Kelvin: " + toKelvin());
        System.out.println("Rankine: " + toRankine());
    }
}
