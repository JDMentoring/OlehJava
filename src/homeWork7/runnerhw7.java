package homeWork7;

public class runnerhw7 {
    public static void main(String[] args) {
      Figure[] figures  = {new Triangle(3,4,5),new Rectangle(5,5),new Circle(3)};
        for (int i = 0; i <figures.length ; i++) {
            System.out.println(figures[i].getSquare());
            System.out.println("Figure ["+i+"]= "+figures[i].toString());
        }
    }




}
