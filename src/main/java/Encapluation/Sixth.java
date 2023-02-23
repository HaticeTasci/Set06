package Encapluation;

public class Sixth extends  Courses{
    @Override
    public void math() {//math override yapti ve buraya bodykoydu.
        System.out.println("Altinci sinif matematigi");//biz buraya kendimiz ne yazacagimizi body kismina yaziyoruz.




    }

    @Override
    public void art() {
        super.art();
        System.out.println("Art should be learned...");
    }



    }

