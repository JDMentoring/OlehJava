package homeWork8;

import java.io.*;
import java.util.ArrayList;

public class WorkOffice implements Serializable {
    private Location address;
    private String phoneNumber;
    private ArrayList<Dispetcher> dispetchers;
    private ArrayList<Order> orders;

    public WorkOffice() {
        this.address = new Location();
        this.phoneNumber = "no number";
        this.dispetchers = new ArrayList<Dispetcher>();
//        readDispetchers();
    }

    public WorkOffice(Location address, String phoneNumber, ArrayList<Dispetcher> dispetchers, Order[] orders) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dispetchers = dispetchers;
        //this.orders = orders;
    }

    public Location getAddress() {
        return address;
    }

    public void setAddress(Location address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Dispetcher> getDispetchers() {
        return dispetchers;
    }

    public void setDispetchers(ArrayList<Dispetcher> dispetchers) {
        this.dispetchers = dispetchers;
    }


    public Dispetcher getDispetcher(int i) {
        return dispetchers.get(i);
    }

 /*   public void getDispetchersFromFile() {
        BufferedReader bf = readFile();
        String line;
        Dispetcher dsp;

        try {
            while ((line = bf.readLine()) != null) {
                String[] information = line.split(",");
                dsp = new Dispetcher();

                dsp.setName(information[0]);
                dsp.setSurname(information[1]);
                dsp.setNumber(information[2]);
                //dsp.setHireingDate();

                dispetchers.add(dsp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }*/

    public void addDispetcher(String name, String surname, String number) {
        Dispetcher disp = new Dispetcher(name, surname, number);
        dispetchers.add(disp);

        writeDispetchers();
    }

    private void writeDispetchers() {
        Serializator.saveData("dispetchers.txt", dispetchers);
    }

    public void readDispetchers() {
        dispetchers = (ArrayList<Dispetcher>) Serializator.readData("dispetchers.txt");
        if (dispetchers == null) dispetchers = new ArrayList<Dispetcher>();

    }


    public String toString() {
        return "WorkOffice{" +
                "address=" + address +
                ", phoneNumber=" + phoneNumber +
                ", dispetchers=" + dispetchers +
                '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkOffice that = (WorkOffice) o;

        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        return dispetchers != null ? dispetchers.equals(that.dispetchers) : that.dispetchers == null;
    }


    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (dispetchers != null ? dispetchers.hashCode() : 0);
        return result;
    }
}
