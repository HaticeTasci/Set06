package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    public static void main(String[] args) {

        add(3, 5);// asagida ne kullacanacgimizi yukaridaki belirliyor.int ise asgidaint bulunacak.
        }

        public static void add ( int a, int b){
            System.out.println(a + b);

        }

        public static void add ( double a, double b){
            System.out.println(a + b);
        }

        public static void add ( double a, int b){
            System.out.println(a + b);
        }

        public static void add ( int a, double b){
            System.out.println(a + b);

        }

        public static void addi ( int a, int b, int c){
            System.out.println(a + b + c);


        }


    }
