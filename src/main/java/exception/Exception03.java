package exception;

public class Exception03 {
    public static void main(String[] args) {

        String s = "Java";
        getCharFromString(s,2);
        getCharFromString(s,4);//StringIndexOutOfBoundsException

    }

    public  static void getCharFromString(String s, int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan index kullanma hatasi...." + e.getMessage());
            e.printStackTrace();//tum hatalarin detaylarini söyluyor.
            System.out.println(e.getCause() );//hataniin sebebi ile ilgili birsey söyluyor.

        }



    }
}
