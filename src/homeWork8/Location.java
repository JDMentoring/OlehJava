package homeWork8;

import java.io.Serializable;

public class Location implements Serializable{
    private static final long serialVersionUID = 44L;
    private String address;
    private double altitude;
    private double longitude;

    public Location() {
        this.address = "noAdress";
        this.altitude = 44.44;
        this.longitude = 44.44;
    }

    public Location(String address, double altitude, double longitude) {
        this.address = address;
        this.altitude = altitude;
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (Double.compare(location.altitude, altitude) != 0) return false;
        if (Double.compare(location.longitude, longitude) != 0) return false;
        return address != null ? address.equals(location.address) : location.address == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = address != null ? address.hashCode() : 0;
        temp = Double.doubleToLongBits(altitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return address+"," + altitude +","+ longitude+",";
    }
}
