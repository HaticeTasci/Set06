package day08nestedifternary;

public class NestedIf05 {

    public static void main(String[] args) {

        String isim = "ali Can?";
        String adinIlkHarfi = isim.substring(0,1);
        Integer boslukIndex = isim.trim().indexOf(' ');
        String soyadinIlkHarfi = isim.substring(isim.indexOf(+1),isim.indexOf(+2));
        Boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
       Boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.
                 charAt(0)<='Z');


        if(boslukIndex ==-1){
            System.out.println("Ad veya soyadi eksik ");
        }
        if(!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
            System.out.println("Bas harflerinde hata"); }
        if(isim.equals(isim.toUpperCase())){ System.out.println("Format hatasi");
        } if(isim.replaceAll("\\s","").length()==0){
            System.out.println("Isim girilmedi "); }
        if(isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){ System.out.println("Gecersiz Isim");
        }



    }
}
