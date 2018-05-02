package homeWork7;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>0) {
            this.radius = radius;
        }
    }

    @Override
    double getSquare() {
        return Math.PI*radius*radius;
    }
}
