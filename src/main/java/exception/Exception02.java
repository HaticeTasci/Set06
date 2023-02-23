package exception;

public class Exception02 {
    public static void main(String[] args) {

      String s = "1234";
      String t = "1a2b";
      convertStringToInt(s);
      convertStringToInt(t);

    }

    public static void convertStringToInt(String s){
        int intS=0;
        try {
            intS = Integer.valueOf(s);
        }catch (NumberFormatException e){
            System.out.println("bir stringim sayiya donusturulmesi icin rakam disi c´´arakter icermesi gerekir");
            System.out.println(e.getMessage());
        }
        System.out.println(intS +1);
    }
}
