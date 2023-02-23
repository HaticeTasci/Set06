package collections;

import java.util.HashSet;
import java.util.TreeSet;



public class TreeSet01 {
    public static void main(String[] args) {
        //tekrarsiz elemnalri sirya gore veror.


long one = System.nanoTime();
        TreeSet <Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);//[3, 8, 12, 25, 32]

         long two = System.nanoTime();
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);



        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println(hts);//[3, 8, 12, 25, 32]
        System.out.println(hs);//[32, 3, 8, 25, 12]random: rastgele siralar.
        long three = System.nanoTime();
        System.out.println("three in uygulama :"+ (two- one));//1416549
        System.out.println(" hashset "+ (three-two));//1084767
        //Note :ThreeSet eleman eklemde cok yavastir.HashSet ise cok hizlidir.TreeSet bu negatif yonunden kurtulmak icn.hashset olusturuurz
        // Bunuda TreeSet e ekleriz.

     int first = ts.first();//3
        System.out.println(first);
        int last = ts.last();
        System.out.println(last);//32

        int floor1 = ts.floor(15);
        System.out.println(floor1);//12
         int floor2 = ts.floor(12);
        System.out.println(floor2);//12
      int ceiling1 =  ts.ceiling(15);
        System.out.println(ceiling1);
      int ceiling2 =  ts.ceiling(25);









    }


}
