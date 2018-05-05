package Lesson19;

import java.util.ArrayList;

public class Lesson19runner {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        ArrayList<PostBox> postBoxes = new ArrayList<>();
        ArrayList<Parcel> parcels = new ArrayList<>();

        //FILL ARRAYS
        //boxes.add(new Box());

        Stuff<Box> boxStuff = new Stuff<>(boxes);


        StuffControl.showBoxInfo(boxStuff);
        //StuffControl.showPostBoxInfo(boxStuff);




    }
}
