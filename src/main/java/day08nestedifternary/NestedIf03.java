package day08nestedifternary;

public class NestedIf03 {
    public static void main(String[] args) {

        // Type code to print
        //a) "Round up by last digit:" and print the rounded value if the last digit is greater than
        //or equal to 5
        //b) "Round down by last digit" and print the rounded value if the last digit is less than 5


        int i = 125;
        if (i % 10 >= 5) {
            System.out.println("Round up by last digit:" + (i / 10 + 1) * 10);
        } else {
            System.out.println("Round down by last digit:" + (i / 10) * 10);
        }
        //Type code to print the name of the month when you entered the number of the month.
        // Example; For 1 output is "January", for 2 output is "February" etc.


        int numOfMonth = 9;
        if (numOfMonth == 1) {
            System.out.println("January");
        } else if (numOfMonth == 2) {
            System.out.println("February");
        } else if (numOfMonth == 3) {
        System.out.println("March");
        }else if(numOfMonth==4){
        System.out.println("April");
        }else if(numOfMonth==5){
        System.out.println("May");
        }else if(numOfMonth==6){
        System.out.println("June");
        }else if(numOfMonth==7){
        System.out.println("July");
        }else if(numOfMonth==8){
        System.out.println("August");
        }else if(numOfMonth==9){
        System.out.println("September");
        }else if(numOfMonth==10){
        System.out.println("November");
        }else if(numOfMonth==11){
        System.out.println("October");
        }else if(numOfMonth==12){
        System.out.println("December");
        }else{
        System.out.println("Invalid month number"); }
    }
}
