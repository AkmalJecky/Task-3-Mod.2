# TEMPERATURE CONVERTER PROGRAM
A simple program for converting temperature to a different form
---

## FEATURES OF THE PROGRAM
this program can convert all type of temperature, such as:
- Celcius
- Fahrenheit
- Kelvin
- Rankie

## CLASSES
there are 3 classes:
- Main
- Temperature
- TemperatureConverter
## OUTPUT EXAMPLE
```
Temperature Input: 100.0°C
Celsius: 100.0
Fahrenheit: 212.0
Kelvin: 373.15
Rankine: 671.67
```


/*
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

//convert to rankie
private double toRankine() {
if (unit.equals("C")) return (temperature + KELVIN_OFFSET) * NINE / FIVE;
else if (unit.equals("F")) return temperature + 459.67;
else return temperature * NINE / FIVE; // dari Kelvin
}