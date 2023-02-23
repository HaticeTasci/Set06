package day20passbyvaluemethodoverloading;

import Encapluation.Student;

public class PassByValue01 {


    public static void main(String[] args) {


        int shirt = 100;

        discount("state",shirt);
        System.out.println(shirt);

        double studentPrice = discount("student",shirt);
        System.out.println(studentPrice);
        double veteran = discount("veteran",shirt);//gazi demek.
        System.out.println(veteran);
        double senior = discount("senior",shirt);
        System.out.println(senior);

    }

    public static double discount(String state, double price) {

        switch (state) {

            case "student":
                price = price * 0.90;
                break;
            case "veteran":
                price = price * 0.80;
                break;
            case "senior":
                price = price * 0.95;
                break;
            default:
                price = price;

        }

        return price;



    }
}
