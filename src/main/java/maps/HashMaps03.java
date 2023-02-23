package maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03 {

    public static void main(String[] args) {
        //size verilen bir cumlede kullnilan harflerin gorunum sayisini gosteren kodu yaziniz.
        // "Java is Java"

        HashMap<String, Integer> lettersMap = new HashMap<>();
        String sentence = "Java is Java";
        sentence = sentence.replaceAll("[^a-zA-Z]", "");
        System.out.println(sentence);

        String[] lettersArray = sentence.split(" ");
        System.out.println(Arrays.toString(lettersArray));

        for (String w : lettersArray) {
            Integer numOfOccurence = lettersMap.get(w);

            if (numOfOccurence == null) {

                lettersMap.put(w,1);

            } else {

                lettersMap.replace(w,numOfOccurence + 1);
            }

        }
        System.out.println(lettersMap);//{JavaisJava=1}
    }
}
