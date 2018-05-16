package homeWork21;

public class Taxi extends Car{
    private  int pricePerKilometer;

    public Taxi(String carNumber, int enginePower, String name, int pricePerKilometer) {
        super(carNumber, enginePower, name);
        this.pricePerKilometer = pricePerKilometer;
    }

    public int getPricePerKilometer() {
        return pricePerKilometer;
    }

    public void setPricePerKilometer(int pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "pricePerKilometer=" + pricePerKilometer +
                "} " + super.toString();
    }
}
