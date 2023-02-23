package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception07 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/exception/File01.txt");

            int k =0;
            while ((k=fis.read()) !=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the fie does not exist ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println();
        System.out.println("Hi1");

    }
}
