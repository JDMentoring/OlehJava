package lesson4;

public class Lesson4_1 {
    public static void main(String[] args) {
        final int month = 12;
        int[][] array = new int[month][];
        for (int i = 0; i < month; i++) {
            if ((i + 1) == 4 || (i + 1) == 6 || (i + 1) == 9 || (i + 1) == 11) {
                array[i] = new int[30];
            } else if ((i + 1) == 2) {
                array[i] = new int[28];
            } else {
                array[i] = new int[31];
            }
        }


        for (int i = 0; i < month; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
//1 3 5 7 8 10 12
// 4 6 9 11
//2