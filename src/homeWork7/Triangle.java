package homeWork7;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA > 0 && sideA < sideB + sideC
                && sideB > 0 && sideB < sideC + sideA
                && sideC > 0 && sideC < sideA + sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA > 0 && sideA < sideB + sideC) {
            this.sideA = sideA;
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB > 0 && sideB < sideC + sideA) {
            this.sideB = sideB;
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC > 0 && sideC < sideA + sideB) {
            this.sideC = sideC;
        }
    }


    double getSquare() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
