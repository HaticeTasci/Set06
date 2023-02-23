package day08nestedifternary;

public class NestedIf06 {
    public static void main(String[] args) {

        //ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        //a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden faz-
        //la olamaz" yazmalıdır.
        //b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yaz- malıdır.
        //c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıda- kilerden farklı karakterler içeremez" yazmalıdır.


        String eyaletKisaltma="FI";

        if (eyaletKisaltma.length()>2){
            System.out.println("eyalet kisaltmlari iki karakterden fazla olmaz");
        }if(eyaletKisaltma.replaceAll("[a-z]","").length()!=0){
            System.out.println("eyalet isimleri kucuk harf iceremez");

        }if (eyaletKisaltma.replaceAll("[A-Za-z]","").length()!=0){

            System.out.println( "2eyalet kisaltmalari sagagidakiden  farkli degerler icermez");
        }




    }
}
