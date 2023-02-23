package calismagrubuAksam;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


        // Select  a number between 1 and 100 to the computer
        // ask the user to guess this number
        // guide the user to large or small the number in each guess entered
        // when the user finds the number, print to the user how many guesses he found the number

        Random rnd = new Random();
        //   System.out.println(rnd);
        Scanner input = new Scanner(System.in);
         int number =0;
         int counter =0;
         int guess =0;

         while (number!=guess){
             System.out.println("Please entre a number");

             guess=input.nextInt();
             if (guess>number){
                 System.out.println("Please enter a small number");
             }else if (guess<number){
                 System.out.println("please enter a large number");
             }
             counter++;

         }

        System.out.println("You find the my number " +counter+ "Guessed");





    }
}
