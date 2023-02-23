package collections;
import java.util.LinkedHashSet;
public class LinkedHashSet01 {
    public static void main(String[] args) {


            LinkedHashSet <String >lhs = new LinkedHashSet<>();
            lhs.add("Ajda");
            lhs.add("Tom");
            lhs.add("Brad");
            lhs.add("Angelina");

        System.out.println(lhs);//[Ajda, Tom, Brad, Angelina]
//Setler bir elemani iki kere yazsakta java onu override yapar.yani sadece bir dafe yazar.java hata vermez.
// tekrarli elemni sete sadece bir defa koyar.

        LinkedHashSet <String>acteress = new LinkedHashSet<>();
        acteress.add("Ajda");
        acteress.add("Angelina");
        lhs.removeAll(acteress);
        System.out.println(lhs);//[Tom, Brad]

        lhs.retainAll(acteress);
        System.out.println(lhs);


    }
}
