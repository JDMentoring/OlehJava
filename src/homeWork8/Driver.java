package homeWork8;

import java.io.Serializable;

public class Driver extends Person implements Serializable{
    private static final long serialVersionUID = 42L;
    private static int nextId;
    private int id;
    private double rating;
    private Car car;
    private Location location;

    public Driver() {
        super();
        setId();
        this.rating = 2.5;
        this.car = null;
        this.location = null;

    }

    public Driver(String name, String surname, String number, int id, double rating, Car car, Location location) {
        super(name, surname, number);
        setId(id);
        this.rating = rating;
        this.car = car;
        this.location = location;

    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Driver.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString() + "," + id + "," + rating + "," + car.toString() + "," + location.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        if (id != driver.id) return false;
        if (Double.compare(driver.rating, rating) != 0) return false;
        if (car != null ? !car.equals(driver.car) : driver.car != null) return false;
        return location != null ? location.equals(driver.location) : driver.location == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + id;
        temp = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
