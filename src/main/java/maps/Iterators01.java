package maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
//Iterator
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Kemal");
        list1.add("Murat");
        System.out.println(list1);//[Ali, Kemal, Murat]

        Iterator<String> itr1 = list1.iterator();
        while (itr1.hasNext()) {
            itr1.next();
            itr1.remove();
        }
        System.out.println(list1);//bos list goruyoruz.

        //ListIterator

        List<String> list2 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Kemal");
        list1.add("Aliye");
        System.out.println(list2);//[Ali, Kemal, Murat]

        ListIterator<String> lstItr = list2.listIterator();

        while (lstItr.hasNext()) {
            String el = lstItr.next();
            lstItr.set(el + "!");
        }
        System.out.println(list2);
        List<String> list3 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Kemal");
        list1.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listItr2 = list3.listIterator();

        while (listItr2.hasNext()) ;
        listItr2.next();

        //hasPrevious sondan elemani almaya baslar.
    }

}
