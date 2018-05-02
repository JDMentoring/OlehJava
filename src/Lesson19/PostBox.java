package Lesson19;

public class PostBox extends Box {
    int id;
    double weight;
    int price;

    public PostBox(int length, int height, int width, int id, double weight, int price) {
        super(length, height, width);
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PostBox postBox = (PostBox) o;

        if (id != postBox.id) return false;
        if (Double.compare(postBox.weight, weight) != 0) return false;
        return price == postBox.price;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + id;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + price;
        return result;
    }

    public void showPostBoxInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "PostBox{" +
                "id=" + id +
                ", weight=" + weight +
                ", price=" + price +
                "} " + super.toString();
    }
}
