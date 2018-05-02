package lesson3;

import lesson2.Product;

import java.util.Random;

public class runner3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Product products[] = new Product[50];
        int rndMaxValue = 50;

        /*for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
        }*/


        Product pr1 = new Product();
        Product pr2 = new Product(1, "Milk", 25);
        Product pr3 = pr2;
        /*pr1.setId(2);
        pr1.setName("Butter");
        pr1.setPrice(25);*/

        products[0] = pr1;
        products[1] = pr2;
        products[2] = pr3;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                products[i].showProduct();
            } else {
                break;
            }
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                products[i].setPrice(random.nextInt(rndMaxValue));
            } else {
                break;
            }
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                products[i].showProduct();
            } else {
                break;
            }
        }

    }
}
