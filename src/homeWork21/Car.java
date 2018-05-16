package homeWork21;

public class Car implements Comparable<Car> {

    private String carNumber;
    private int EnginePower;
    private String name;

    public Car(String carNumber, int enginePower, String name) {
        this.carNumber = carNumber;
        EnginePower = enginePower;
        this.name = name;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int enginePower) {
        EnginePower = enginePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Car o) {
        if (this.carNumber.compareTo(o.carNumber) < 1)
            return -1;
        if (this.carNumber.compareTo((o.carNumber)) > 1)
            return 1;
        return 0;
    }


    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                ", EnginePower=" + EnginePower +
                ", name='" + name + '\'' +
                '}';
    }
}

