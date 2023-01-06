package mrfrotan;

public class School {

    // class member

    String okulIsmi="Yusuf İzzet";
    boolean isActive=true;
    int yil=2022;

    public static void okulIsmiYazdir(String okulIsmi) {

        System.out.println(okulIsmi);
    }
    public static void YilYazdir(int yil) {
        System.out.println(yil);
    }

    public boolean isActive(boolean isActive){
        return isActive;

    }

}
