package maps;

import java.util.HashMap;

public class HashMaps02 {
    public static void main(String[] args) {
        //size verilen bir cumledeki her bir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
        //"Java is easy.Java is OOP.OOP makes Java easy"


        HashMap<String ,Integer> wordsMap =new HashMap<>();
        String sentence ="Java is easy. Java is OOP. OOP makes Java easy.";
        System.out.println(sentence);
        sentence=sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);
      String []wordsArray =  sentence.split(" ");
        System.out.println(wordsArray);

        for (String w : wordsArray){
            Integer numOfOccurunce =  wordsMap.get(w);

            if (numOfOccurunce ==null){
                wordsMap.put(w,1);
            }else {
                wordsMap.replace(w,numOfOccurunce+1);
            }
        }
        System.out.println(wordsMap);


    }

}
