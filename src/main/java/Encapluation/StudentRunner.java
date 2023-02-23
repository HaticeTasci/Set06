package Encapluation;

public class StudentRunner {

    public static void main(String[] args) {

        Student myStd = new Student();

         String stdId = myStd.getStdId();
        System.out.println(stdId);//AC123


        myStd.setGpa(4.0);

        System.out.println(myStd.getGpa());
    }




}
