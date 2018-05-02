package lesson2;

public class Product {
    private int id;
    private String name;
    private int price;


    public Product(){
        this.id = -1;
        this.name = "no name";
        this.price = -1;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id){
       this.id = id;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  void showProduct(){
        System.out.println("product id: "+id+" name:"+name+" price:"+price);
    }
}
