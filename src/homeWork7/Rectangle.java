package homeWork7;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle() {
        this.sideA = 0;
        this.sideB = 0;
    }

    public Rectangle(int sideA, int sideB) {
        if (sideA > 0 && sideB > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA>0) {
            this.sideA = sideA;
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB>0) {
            this.sideB = sideB;
        }
    }


    double getSquare() {
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                "} " + super.toString();
    }
}
