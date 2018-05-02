package homeWork8;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 43L;
    private String brand;
    private char carClass;
   private String carNumber;

    public Car() {
        this.brand = "noBrand";
        this.carClass = 'A';
        this.carNumber = "AA1111AA";
    }

    public Car(String brand, char carClass, String carNumber) {
        this.brand = brand;
        this.carClass = carClass;
        this.carNumber = carNumber;
    }

    private void setCarClass(){
        this.carClass = 'A';
    }

    private void setCarClass(char carClass) {
        if (carClass=='A'||carClass=='B'||
            carClass=='C'||carClass=='D'||
            carClass=='E'||carClass=='E') {
            this.carClass = carClass;
        }else setCarClass();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public char getCarClass() {
        return carClass;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return brand+"," + carClass+"," + carNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (carClass != car.carClass) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        return carNumber != null ? carNumber.equals(car.carNumber) : car.carNumber == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (int) carClass;
        result = 31 * result + (carNumber != null ? carNumber.hashCode() : 0);
        return result;
    }
}
