package Lesson15;

public interface Inputer {
    String TYPE = "Interface Inputer";
    default void showType(){
        System.out.println(TYPE);
    }
    String getData();

}
