package homeWork8;

import lesson6.ConsoleScanner;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Base {
    private int id;
    private Location address;
    private ArrayList<Driver> drivers;
    private String filePath = "drivers.txt";

    public Base() {
        this.id = 1;
        this.address = new Location("Трускавець", 23.506, 49.278);
    }

    public Base(int id, Location address, ArrayList<Driver> drivers) {
        this.id = id;
        this.address = address;
        this.drivers = drivers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getAddress() {
        return address;
    }

    public void setAddress(Location address) {
        this.address = address;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public void getDriversFromFile() {
        BufferedReader bf = readFile();
        String line;
        Driver dr;
        //Driver.setNextId(0);
        try {
            while ((line = bf.readLine()) != null) {
                String[] information = line.split(",");
                dr = new Driver();

                dr.setName(information[0]);
                dr.setSurname(information[1]);
                dr.setNumber(information[2]);
                dr.setId(Integer.parseInt(information[3]));
                dr.setRating(Double.parseDouble(information[4]));
                dr.setCar(new Car(information[5], information[6].charAt(0), information[7]));
                dr.setLocation(new Location
                        (information[8], Double.parseDouble(information[9]), Double.parseDouble(information[10])));
                drivers.add(dr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void addDriver(String name, String surname, String number, int id, double rating, Car car, Location location)

            throws Exception {
        Driver driver = new Driver(name, surname, number, id, rating, car, location);
        drivers.add(driver);
        saveDrivers();
    }

    public void addDriver(Driver temp) throws Exception {
        drivers.add(temp);
        saveDrivers();
    }

    public void addDriver() {
        Driver driver = new Driver();
        driver.setName(ConsoleScanner.readStringValue("Введіть Ім'я водія"));
        driver.setSurname( ConsoleScanner.readStringValue("Введіть прізвище  водія"));
        driver.setNumber( ConsoleScanner.readStringValue("Введіть номер телефону водія"));
            driver.setId(ConsoleScanner.readIntValue("Введіть id водія"));
        driver.setRating(2.5);
        driver.setCar(new Car());
        driver.setLocation(new Location());
        drivers.add(driver);
        saveDrivers();
    }

    public Driver getDriver(int i) {
        return drivers.get(i);
    }

    public void showDrivers() {
        for (Driver driver : drivers) {
            System.out.println(driver.toString());
        }
    }

   /* private void writeFile(ArrayList drivers) throws Exception {
        FileWriter writer = new FileWriter(new File("drivers.txt"), true);
        String s = "";
        for (int i = 0; i < drivers.size(); i++) {
            s = s + drivers.get(i).toString();
        }
        writer.write(s + "\n");
        writer.close();
    }*/

    private void saveDrivers() {
        //      String path = ConsoleScanner.readStringValue("Please enter a file path>>");
        Serializator.saveData(filePath, drivers);
    }

    public void loadDriver() {
        // String path = ConsoleScanner.readStringValue("Pleace enter a file path>>");
        drivers = (ArrayList<Driver>) Serializator.readData(filePath);
        if (drivers == null) drivers = new ArrayList<Driver>();

    }

    private BufferedReader readFile() {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("drivers.txt");
            bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return bufferedReader;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Base base = (Base) o;

        if (id != base.id) return false;
        if (address != null ? !address.equals(base.address) : base.address != null) return false;
        return drivers != null ? drivers.equals(base.drivers) : base.drivers == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (drivers != null ? drivers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", address=" + address +
                ", drivers=" + drivers +
                '}';
    }


}
