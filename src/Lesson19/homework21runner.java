package Lesson19;

import homeWork21.*;

public class homework21runner {
    public static void main(String[] args) {
        AutoBase<Car> cars = new AutoBase<>();
        AutoBase<Taxi> taxies = new AutoBase<>();
        AutoBase<Bus> buses = new AutoBase<>();

        cars.addVeichle(new Car("AA1111AA",150,"carName"));
        taxies.addVeichle(new Taxi("AA2222AA",150,"Renault",25));
        buses.addVeichle(new Bus("AA1111AA",150,"Bohdan",2,70));
        VeichleStatus.showCarInfo(taxies);
        VeichleStatus.showTaxiInfo(buses);
        //VeichleStatus.showCarInfo(buses);
    }
}
