package homeWork8;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private static int nextId;
    private Client client;
    private int driverId;
    private Location location;
    private int price;
    private String startTime;
    private int destination;

    public Order() {
        this.id = -1;
        this.client = new Client();
        this.driverId = -1;
        this.location = new Location();
        this.price = -1;
        this.startTime = LocalDateTime.now()+"";
        this.destination = -1;
    }

    public Order(int id, Client client, int driverId, Location location,
                 int price, String startTime, int destination) {
        this.id = id;
        this.client = client;
        this.driverId = driverId;
        this.location = location;
        this.price = price;
        this.startTime = startTime;
        this.destination = destination;
    }

    public int getNextId() {
        return nextId;
    }

    private void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(){
        this.id = nextId;
        nextId++;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+"," + client+"," + driverId+"," + location + price +","+ startTime+"," + + destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (driverId != order.driverId) return false;
        if (price != order.price) return false;
        if (destination != order.destination) return false;
        if (client != null ? !client.equals(order.client) : order.client != null) return false;
        if (location != null ? !location.equals(order.location) : order.location != null) return false;
        return startTime != null ? startTime.equals(order.startTime) : order.startTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + driverId;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + destination;
        return result;
    }
}
