package day08nestedifternary;

import java.util.Locale;

public class NestedIf01 {

    public static void main(String[] args) {

        //    Type code to print
        //    a) "Winter" for December, January, February
        //    b) "Spring" for March, April, May
        //   c) "Summer" for June, July, August
        //    d) "Fall" for September, October, November e) "Invalid month name" for all the others


        String mName = "ocak";
        mName = mName.toLowerCase();
        if (mName.equals("december") || mName.equals("january") || mName.equals("february")) {
            System.out.println("Winter");
        } else if (mName.equals("march") || mName.equals("april") || mName.equals("may")) {
            System.out.println("Spring");
        } else if (mName.equals("june") || mName.equals("july") || mName.equals("august")) {
            System.out.println("Summer");
        } else if (mName.equals("september") || mName.equals("october") || mName.equals("november")) {
            System.out.println("Fall");
        } else {
            System.out.println("Invalid month name");
        }
    }
        }
