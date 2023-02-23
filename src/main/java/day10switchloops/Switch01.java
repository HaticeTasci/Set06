package day10switchloops;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        //a0y numasasini syleyince ,numarasi verilen aydan baslayip,12.aya kadar tum aylaarin isinmlerini yaziniz.
        //8==

        Scanner input = new Scanner(System.in);

        System.out.println("baslangic ayini giriniz");

        int numOfMonth = input.nextInt();

        switch (numOfMonth) {//switchte int ve string kullanilabilir.
     case 1:
      System.out.println("Januaray");

    switch (numOfMonth) {
      case 2:
     switch (numOfMonth) {
      case 3:
     System.out.println("March");
      break;
      default:
       System.out.println("gecerli i ay numarasi giriniz");


     }

    }
        }
    }

    }



