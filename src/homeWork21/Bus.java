package homeWork21;

public class Bus extends Taxi{
    private int carryingCapacity;

    public Bus(String carNumber, int enginePower, String name, int pricePerKilometer, int carryingCapacity) {
        super(carNumber, enginePower, name, pricePerKilometer);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "carryingCapacity=" + carryingCapacity +
                "} " + super.toString();
    }
}
