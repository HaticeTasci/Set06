package maps;

import java.util.HashMap;

public class HashMapMechanism {
    public static void main(String[] args) {

        HashMap<String ,Integer> hm = new HashMap<>();
        hm.put("Istanbul",170000);
        hm.put("Miami",50000);
        hm.put("Moscow",200000);
        hm.put("new Delhi",31100000);

        System.out.println(hm);

    }
}
