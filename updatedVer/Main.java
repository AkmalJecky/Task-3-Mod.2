package task3.updatedVer;

// Move Method → pindahkan main() ke class baru
class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter(100, "C");
        converter.convert();
    }
}