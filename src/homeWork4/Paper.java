package homeWork4;

public class Paper {
    private String type;
    private int density;
    private int whiteness;

    public Paper() {
        type = "no type";
        density = 80;
        whiteness = 60;
    }

    public Paper(String type, int density, int whiteness) {
        setType(type);
        setDensity(density);
        setWhiteness(whiteness);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        if (10 < density || density < 350) {
            this.density = density;
        }
    }

    public int getWhiteness() {

        return whiteness;

    }

    public void setWhiteness(int whiteness) {
        if (0 <= whiteness || whiteness <= 100) {
            this.whiteness = whiteness;
        }
    }


}
