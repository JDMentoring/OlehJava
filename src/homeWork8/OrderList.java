package homeWork8;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderList {
    ArrayList<Order> orders;

    public OrderList() {
        this.orders = new ArrayList<Order>();
    //    LoadOrders();
    }

    public OrderList(ArrayList<Order> orders) {
        this.orders = orders;
    }

  //  int id, Client client, Driver driver, Location location,
   // int price, LocalDateTime startTime, int destination
    private void LoadOrders() {

        BufferedReader bf = readFile();
        String line;
        Order ord;
        try {
            while ((line = bf.readLine()) != null) {
                String[] information = line.split(",");
                ord = new Order();
                ord.setId(Integer.parseInt(information[0]));
                ord.setClient(new Client(information[1],information[2],information[3],information[4]));
                ord.setDriverId(Integer.parseInt(information[5]));
                ord.setLocation( new Location(information[6],
                        Double.parseDouble(information[7]),Double.parseDouble(information[8])));
                ord.setPrice(Integer.parseInt(information[9]));
                ord.setStartTime(information[10]);
                ord.setDestination(Integer.parseInt((information[11])));


                orders.add(ord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addOrder(Order nOrder)throws Exception{
        Order ord= nOrder;
            orders.add(ord);
            writeFile(orders);
    }

    public Order getOrder(int i){
        return orders.get(i);
    }

    private void writeFile(ArrayList locDispetchers) throws Exception {
        FileWriter writer = new FileWriter(new File("orders.txt"), true);
        String s = "";
        for (int i = 0; i < orders.size(); i++) {
            s = s + locDispetchers.get(i).toString();
        }
        writer.write(s + "\n");
        writer.close();
    }

    private BufferedReader readFile() {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("oreders.txt");
            bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }



    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }


}
