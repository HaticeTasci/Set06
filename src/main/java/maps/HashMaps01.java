package maps;

import javafx.print.Collation;

import java.util.*;

public class HashMaps01 {
    public static void main(String[] args) {

        //haschmap nasil olusturlulur.
        HashMap<String,  Integer> hm =new HashMap<>();
        System.out.println(hm);//{}

        hm.put("Usa", 40000000);
        hm.put("Turkiye", 8600000);
        hm.put("Germany", 8500000);
        hm.put("Turkiye", 8900000);//var olan value update edilir.
        hm.put(null,120000);
        hm.put(null,180000);
        hm.put("Mymmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{Turkiye=8600000, Usa=40000000, Germany=8500000} rastgele yazdiriyor.
        //hashmaplerde sadece keyleri alamk istiyorum
        Set<String> hmKeys = hm.keySet();//keyset tekrarsiz datalari bize verecek.
        System.out.println(hmKeys);//[Turkiye, null, Usa, Bhutan, Mymmar, Germany]
        //sadece value alabilir miyiz?
        //hm map ulkelerin toplan nufusunu bulunuz

  Collection<Integer> hmValues = hm.values();
  int sum =0;
  for (Integer w : hmValues){
      if (w!=null) {
          sum = sum +w;

      }
  }
        System.out.println(sum);//57580000
//Hashmaplerde belirle bir keyinin valuesunu nasil alabiliriz.
      Integer usaPopulation =  hm.get("Usa");
        System.out.println(usaPopulation);//40000000

        hm.replace("Bhutan", 350000);//varolan bir  key in value'sunu degistirmek icin kullanilir.
        System.out.println(hm);// Bhutan=350000, varolan datayi degisrirdik.
        hm.putIfAbsent("USA",7000000);//
        System.out.println(hm);//USA=7000000

        //example 2: yeni ögretmenin maasi standart ucretten 1000 tl fazla,eski ögretmenuin massi 2000 tl fazla olsun

        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName ="Kemal";//Kemal=1100
        if (salaries.keySet().contains(teacherName)){
            salaries.putIfAbsent(teacherName,1100);//kemal listde yoksa kemal 1100 olarak listeye ekliyor.
        }else{
            salaries.put(teacherName,1200); //Tom=1200
        }
        System.out.println(salaries);
        hm.replace("Usa", 40000000,80000000);//bu metod eskisini silip yenisini ekliyor.
        System.out.println(hm);

        //getOrDefault metodu olan key lerin degerini verir.olmayan keyler icin sizin ikinci prametreye yazdiginiz degeri verir.
        Integer r =  hm.getOrDefault("tan",100);
        System.out.println(r);

        //entrySet(); metodu Map i Set e cevirir.
        //Setlerin metodlarini kullanabilmek icin entrySet(); metodunu kullanarak Map i Sete cevirirz.
        //Map i sete cevirdugumuzde setin butun ozelliklerini kullanabiliriz.Mesela: Loop gibi.
        //EntrSet metoduunu kullandiginizda elde ettiginiz setin elemanlari bir Map olur.Bu yuzden elemlar icin Map metodlari kullanilabilir.
      Set<Map.Entry<String,Integer>> myEntries =  hm.entrySet();
        System.out.println(myEntries);
        //example 3: ulkede ismindeki karakter sayisini ulke nufusuna ekleyen ve sonucu konsola yazdiran kodu konsola yazdiriniz.

        for (Map.Entry<String,Integer> w : myEntries){

            if (w.getValue()!=null && w.getKey()!=null) {

                int toplam =w.getValue() + w.getKey().length();
                System.out.println(toplam);//8900007 80000003 350006   8500007 entr set cok kullanilir






            }

        }






    }

}
