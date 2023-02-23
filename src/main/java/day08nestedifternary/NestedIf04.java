package day08nestedifternary;

public class NestedIf04 {
    public static void main(String[] args) {


        // Type code to print
        //a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        //b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        //c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied


        int a=3;
        int b=3;
        int c=3;
        if (a==b&&b==c){
            System.out.println("Equilateral Triangle");
        }else if(a==b && b!=c||a==c &&b!=c ||b==c&&b==c &&a!=c){
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Neither isosceles, nor equilateral");
        }
        //Type code to create a converter which converts mile to km, second to hour, fahrenheit to celsius. Find the formulas for conversions from Google.
        //a) When user entered 10 and mileToKm String, your code should print "16 km"(The number will be dynamic) on the console
        //b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The number will be dynamic) on the console
        //c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333 celsius"(The number will be dynamic) on the console


        double mil = 10;
        double saniye = 7200;
        double fahrenayt= 83;

        String operator = " fahrenaytdanSantigarata ";
        if(operator.equals("mildenKmye ")){
            System.out.println(mil*1.60934);
        }else if(operator.equals("saniyedenSaate ")){
            System.out.println((saniye /60)/60);
        }else if(operator.equals("fahrenaytdanSantigarata ")){
            System.out.println((fahrenayt -32)*5/9);
        }



    }
}
