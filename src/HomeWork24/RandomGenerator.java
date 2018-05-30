package HomeWork24;

import java.util.Random;

public class RandomGenerator {
    static Random r = new Random();

    public static String createNewPass() {
        String pass = "";
        int ch = 0;
        for (int i = 0; i < 4; i++) {
            try {
                ch = r.nextInt(10);
                pass += ch;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return pass;
    }

    public static String createNewCardNumber() {
        String cardNum = "";
        int ch = 0;
        for (int i = 0; i < 16; i++) {
            try {
                ch = r.nextInt(10);
                cardNum += ch;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cardNum;
    }

    public static int createRandBallance(){
        return r.nextInt(100000);
    }

}
