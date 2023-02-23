package ternary;

public class Ternary01 {

    public static void main(String[] args) {

        int a= 10;
        int b=20;

    int r1 = a<b  ?  a++ : b++;//a buyukse 7 dogruysa a artar.anlissa b artar.
        System.out.println(r1);//post increment var.
        System.out.println(a);//kod oku. .kodu once bir dusun.ciktiyi dusun ve yaz.
        System.out.println(b);

        //example 2:verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        // -4 *-1 =sayiyi negatfi ile carpmamiz  gerekir.


        int c=-4;
        int r2 =   c<0 ? -1*c : c ;//iki negatif sayinin carpimi pozitif verir.
        System.out.println(r2);//4


        //exaple 3: iki sayinin isarreti ayni ise bu sayilari carpan isaretleri farkli ise "farkli isaretli sayilari carpamiyorum "mesaji
        //veren kodu yaziniz

        int m =5;
        int n= -6;

      Object r3 =  (m>0 && n>0) || (m<0 && n<0) ?  m*n :"farki isatrreleri carpamiyorum";//ternary eger farkli data tiplerinde sonuc veririse neler yapacsagi
        System.out.println(r3);
        //object bir data tipidir.object parenti olmayan tek data tipidir.objeckt her data tipinin parentidir.
        //butun classlarin ortak babasidir.Hz.Adem örnegi.farkli data tiplerini object icinde calistirir.orn .strtring ve int objeckte yazdirabiliriz.
        //



    }
}
