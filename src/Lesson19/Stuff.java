package Lesson19;

import java.util.ArrayList;

public class Stuff<P extends Box> {
    ArrayList<P> stuff;

    public Stuff(ArrayList<P> stuff) {
        this.stuff = stuff;
    }

}
