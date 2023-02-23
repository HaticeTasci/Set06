package day08nestedifternary;

public class NestedIf07 {
    public static void main(String[] args) {

        //Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi oluşturmak için kod yazınız.
        //a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        //b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        //c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        //d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.


        double a=156.2,b=5;
        String operator="-";
        if (operator.equals("+")){
            System.out.println(a+b);

        }else if(operator.equals("-")){
            System.out.println(a-b);
        }else if(operator.equals("*")){
            System.out.println(a*b);
        }else if(operator.equals("/")){
            System.out.println(a/b);


        }
    }
}
