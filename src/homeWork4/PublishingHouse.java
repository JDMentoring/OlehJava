package homeWork4;

public class PublishingHouse {
    private  String name;
    private String adress;
    private String number;
    public PublishingHouse(){
      name="no name";
      adress="nowhere";
      number="no number";
    }
    public PublishingHouse(String name, String adress, String number) {
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
