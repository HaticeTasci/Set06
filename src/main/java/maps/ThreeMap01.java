package maps;

import java.util.HashMap;
import java.util.TreeMap;

public class ThreeMap01 {
    public static void main(String[] args) {


        long one =System.nanoTime();

        TreeMap<String, Integer> stdAges = new TreeMap<>();
        stdAges.put("Ali", 21);
        stdAges.put("Ayse", 19);
        stdAges.put("Kemal", 5);
        stdAges.put("Murat", 22);
//key lere gore alfabetik sira yapti.
        System.out.println(stdAges);//{Ali=21, Ayse=19, Kemal=5, Murat=22}
        long two =System.nanoTime();

        HashMap<String, Integer> stdAges1 = new HashMap<>();
        stdAges1.put("Ali", 21);
        stdAges1.put("Ayse", 19);
        stdAges1.put("Kemal", 5);
        stdAges1.put("Murat", 22);
        System.out.println(stdAges1);
        long three =System.nanoTime();

        HashMap<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Ali", 21);
        stdAges2.put("Ayse", 19);
        stdAges2.put("Kemal", 5);
        stdAges2.put("Murat", 22);
        System.out.println(stdAges1);
        TreeMap<String ,Integer> stdAges4 = new TreeMap<>(stdAges2);
        System.out.println(stdAges4);
       long four = System.nanoTime();


        System.out.println("TreeMap : "+ (two-one));
        System.out.println("HashMap : "+ ( three-two));
        System.out.println("HashMap --> TreeMap "+ (four- three));
    }
}
