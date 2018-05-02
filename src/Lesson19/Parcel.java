package Lesson19;

public class Parcel extends PostBox{
    String addres;
    String person;
    String number;

    public Parcel(int length, int height, int width, int id, double weight, int price, String addres, String person, String number) {
        super(length, height, width, id, weight, price);
        this.addres = addres;
        this.person = person;
        this.number = number;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Parcel parcel = (Parcel) o;

        if (addres != null ? !addres.equals(parcel.addres) : parcel.addres != null) return false;
        if (person != null ? !person.equals(parcel.person) : parcel.person != null) return false;
        return number != null ? number.equals(parcel.number) : parcel.number == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (addres != null ? addres.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    public void showParcelInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "addres='" + addres + '\'' +
                ", person='" + person + '\'' +
                ", number='" + number + '\'' +
                "} " + super.toString();
    }
}
