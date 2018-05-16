package homeWork21;


import java.util.ArrayList;

public class AutoBase<A extends Car> {

    private ArrayList<A> array;

    public AutoBase(ArrayList<A> array) {
        this.array = array;
    }

    public AutoBase() {
        this.array = new ArrayList<>();
    }

    public ArrayList<A> getArray() {
        return array;
    }

    public void addVeichle(A veichle){
        array.add(veichle);
    }

    public void showInfo(){
        for (A item:array) {
            System.out.println(item.toString());
        }
    }

}
