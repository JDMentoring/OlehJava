package HomeWork22;

import java.time.LocalDate;

public class NationalVisa extends TransitVisa {
    String remarks;
    int id;

    public NationalVisa(String name, String surname, String country, LocalDate issuanceDate, int period, String remarks, int id) {
        super(name, surname, country, issuanceDate, period);
        this.remarks = remarks;
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NationalVisa{" +
                "remarks='" + remarks + '\'' +
                ", id=" + id +
                "} " + super.toString();
    }
}
