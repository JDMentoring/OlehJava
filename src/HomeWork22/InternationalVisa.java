package HomeWork22;

import java.time.LocalDate;

public class InternationalVisa extends NationalVisa {
    String contractCountries;

    public InternationalVisa(String name, String surname, String country, LocalDate issuanceDate, int period, String remarks, int id, String contractCountries) {
        super(name, surname, country, issuanceDate, period, remarks, id);
        this.contractCountries = contractCountries;
    }

    public String getContractCountries() {
        return contractCountries;
    }

    public void setContractCountries(String contractCountries) {
        this.contractCountries = contractCountries;
    }

    @Override
    public String toString() {
        return "InternationalVisa{" +
                "contractCountries='" + contractCountries + '\'' +
                "} " + super.toString();
    }
}
