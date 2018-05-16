package HomeWork22;

import java.time.LocalDate;

public class TransitVisa {
    String name;
    String surname;
    String country;
    LocalDate issuanceDate;
    int period;

    public TransitVisa(String name, String surname, String country, LocalDate issuanceDate, int period) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.issuanceDate = issuanceDate;
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(LocalDate issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "TransitVisa{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", issuanceDate=" + issuanceDate +
                ", period=" + period +
                '}';
    }
}

