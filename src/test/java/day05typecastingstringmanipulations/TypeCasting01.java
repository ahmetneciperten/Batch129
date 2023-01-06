package day05typecastingstringmanipulations;

public class TypeCasting01 {
    /*  Numeric primitive data typelarinin birbirine donusturulmsine "Type Casting" denir.
    Numeric (Sayisal) Data Typelar byte - short - int - long - float - double

    Note 1: Kucuk data typelarini buyuk data typelarina cevirmeyi Java otomatik olarak yapar.
            Bu isleme "AutoWidening" (otomatik genişletme) denir.

    Note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir, Java bu riskli isi otomatik olarak yapmaz.
            bu islemi kod yazanlar yapar.
            Bu isleme "ExplicitNarrowing" (Aciktan daraltma) denir.

     */

    public static void main(String[] args) {

        //byte data type'ini int data type'ina ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //long data type'ini short data type'ina cevirelim
        long weight = 234;
        short weightShort = (short)weight;//Explicit Narrowing

        //int data type'ini float data type'ina ceviriniz
        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type'ini short data type'ina ceviriniz
        double number = 12.934;
        System.out.println(number);//12.934

        short numberShort = (short)number;
        System.out.println(numberShort);//12

        //Dikkat!
        //Donusum yaptiginiz sayi(260), donuseceginiz data type'inin sinirlari disinda ise, Java kullandiginiz sayi ile "mod" islemi
        //yapar ve mod isleminin sonucu sizin yeni degeriniz olur
        //Example 1:
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //Example 2:
        short n = 1023;
        System.out.println(n);//1023

        byte nByte = (byte)n;
        System.out.println(nByte);//-1

    }

}