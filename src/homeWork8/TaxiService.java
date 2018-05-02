package homeWork8;

import java.util.Arrays;

public class TaxiService {
    private String name;
    private String[]phones;
   // private Base base;
    private WorkOffice workOffice;

    public TaxiService() {
        this.name = "noname";
        this.phones = null;
        this.workOffice = null;
    }

    public TaxiService(String name, String[] phones, WorkOffice workOffice) {
        this.name = name;
        this.phones = phones;
        this.workOffice = workOffice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public WorkOffice getWorkOffice() {
        return workOffice;
    }

    public void setWorkOffice(WorkOffice workOffice) {
        this.workOffice = workOffice;
    }

    @Override
    public String toString() {
        return "TaxiService{" +
                "name='" + name + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", workOffice=" + workOffice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxiService that = (TaxiService) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(phones, that.phones)) return false;
        return workOffice != null ? workOffice.equals(that.workOffice) : that.workOffice == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(phones);
        result = 31 * result + (workOffice != null ? workOffice.hashCode() : 0);
        return result;
    }
}
