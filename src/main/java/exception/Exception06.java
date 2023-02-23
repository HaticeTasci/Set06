package exception;

import java.util.EventListener;

public class Exception06 {
    public static void main(String[] args) {

        try {
            getMark(120);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static void getMark(double d){

        if (d<0){
            throw new IllegalArgumentException("marks cannot be less than zero");
        }else if(d>100){
            throw new IllegalArgumentException("marks cannot be less than zero");
        }else {
            System.out.println(d);
        }
    }
}
