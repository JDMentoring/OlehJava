package Lesson19;

public class Box {
    int length;
    int height;
    int width;

    public Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void setLength(int length){

        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (length != box.length) return false;
        if (height != box.height) return false;
        return width == box.width;
    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    public void showBoxInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
