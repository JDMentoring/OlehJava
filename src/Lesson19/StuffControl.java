package Lesson19;

public class StuffControl {
    static void showBoxInfo(Stuff<?> someArgs){
        for (int i = 0; i <someArgs.stuff.size() ; i++) {
            someArgs.stuff.get(i).showBoxInfo();
        }
    }

    static void showPostBoxInfo(Stuff<? extends PostBox> someArgs){
        for (int i = 0; i <someArgs.stuff.size() ; i++) {
            //someArgs.stuff.get(i).showPostBoxInfo();
        }
    }

    static void showParcelBoxInfo(Stuff<? extends Parcel> someArgs){
        for (int i = 0; i <someArgs.stuff.size() ; i++) {
            someArgs.stuff.get(i).showParcelInfo();
        }
    }
}
