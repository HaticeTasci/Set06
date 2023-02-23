package ternary;
public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 5;//variable verilen deger.
        System.out.println(a);
        a = a + 2;//buna increment denir. a +=2; seklindede yazabiliriz.
        System.out.println(a);
        //
        int b= 7;
        System.out.println(b);
        b =b+5;//b +=5;
        System.out.println(b);
        b +=5;
        System.out.println(b);
        int c = 8;
        System.out.println(c);
        c = c-3;
        System.out.println(c);
        c-=3;
        System.out.println(c);//decrement

        //increment 2: carpma ile de yapabilirz
        int d= 6;
        System.out.println(d);
        d= d*2; //d *=2;
        System.out.println(d);

        //decrement 2: decrementi bolme ile de yapabilirz
        int e = 24;
        System.out.println(e);
        e=e/2;
        System.out.println(e);
        e /=2;
        System.out.println(e);

        //"1" ile increment ile decrement cok fazla yapilir.okul app kullnilir.cunku cocuklarin yasi surekli artar.
        int f= 12;
        f++;//ozel bir kullanim.bir ile decrement.
        int h=10;//decrementi 1 ile yapma en yaygin hali.
        h--;
        //post incerement ve pre increment.pre:once. post:sonra demek.
        //

        int i =10;
        int k =i++; //increment variablden sonra geliyor.pro increment denir.
        System.out.println(k);
        System.out.println(i);
        int m=15;
        int n=++m; //increment variableden once geliyor. pre increment denir.
        System.out.println(m);
        System.out.println(n);

        // post  ve pre decrement de ayni sekilde.

        int p= 17;
        int r= p--;
        System.out.println(p);
        System.out.println(r);


    }

}
