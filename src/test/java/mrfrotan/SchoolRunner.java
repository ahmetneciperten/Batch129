package mrfrotan;

import mrfrotan.School;

public class SchoolRunner {


    public static void main(String[] args) {

        School obj= new School();
        System.out.println(obj.isActive);
        System.out.println(obj.yil);
        System.out.println(obj.okulIsmi);

        School.okulIsmiYazdir("Vali Recai");
        School.YilYazdir(2023);

        System.out.println(obj.isActive(false));

    }

}
