package exception;

public class Exception05 {
    public static void main(String[] args) {


        int a =16;
        int b = 5;
        String s ="My Java";
        getCahrFromString(s,a,b);
    }
    public static void getCahrFromString(String s , int a, int b) {

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan index kullandiniz");
        }
    }

}
