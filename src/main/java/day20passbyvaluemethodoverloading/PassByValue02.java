package day20passbyvaluemethodoverloading;

public class PassByValue02 {


    public  static void main(String[] args) {


        String  name = "Tom Hanks";

      String upDate=  updateName(name,"Jr.");
        System.out.println(upDate);

        System.out.println(name);



    }

    public static String updateName(String name, String add) { //update yenile demektir.
        name = name + " " + add;
        return name;//bu method ismi degistirecek.




    }

}
