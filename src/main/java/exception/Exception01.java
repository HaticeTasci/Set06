package exception;

public class Exception01 {
    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a,b);

        divide2(a,b);
    }
    public static void divide(int a, int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e ){
            System.out.println("Do not divide by zero");
        }

    }
    //aritmetik exeption
    public static void divide2(int a, int b){
//if else exception da kullanilmaz.
        if (b==0){
            System.out.println("Do not divide by zero");
        }else {
            System.out.println(a/b);

        }
    }

}

