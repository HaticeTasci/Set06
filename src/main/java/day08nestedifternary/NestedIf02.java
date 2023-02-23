package day08nestedifternary;

public class NestedIf02 {
    public static void main(String[] args) {
        //2) Type code to print
        //a) "Valid Password" if the password has at least 8 characters different from space
        //character
        //b) "Do not use space character in password" if the password has any space
        //character in any position
        //c) "Invalid Password" if a and b conditions are not satisfied Note: Be careful about the orders of conditions in the solution



        String password = "a1b2c3e?";

        if (password.replaceAll("\\S", "").length()>0){

            System.out.println("do nit use space chrecter in password");


        }else if(password.replaceAll("\\S","").length()>=8){
            System.out.println("valid password");

        }else {
            System.out.println("invalid password");
        }
    }
}
