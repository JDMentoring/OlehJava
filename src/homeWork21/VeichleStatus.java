package homeWork21;

public class VeichleStatus {
    public static void showCarInfo(AutoBase<? extends Car> autoBase){

        for (int i = 0; i <autoBase.getArray().size(); i++) {
            System.out.println("\nCar number : " + autoBase.getArray().get(i).getCarNumber());
            System.out.println("Car name : " + autoBase.getArray().get(i).getName());
            System.out.println("Car engine power : " + autoBase.getArray().get(i).getEnginePower());
        }
    }

    public static void showTaxiInfo(AutoBase<? extends Taxi> autoBase){

        for (int i = 0; i <autoBase.getArray().size(); i++) {
            System.out.println("\nTaxi number : " + autoBase.getArray().get(i).getCarNumber());
            System.out.println("Taxi name : " + autoBase.getArray().get(i).getName());
            System.out.println("Taxi price per kilometer : " + autoBase.getArray().get(i).getPricePerKilometer());
        }
    }
}
