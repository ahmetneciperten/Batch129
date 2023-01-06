package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)alanini hesaplayiniz
        //ii)cevresini hesaplayiniz

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kisa kenar uzunlugunu giriniz...");
        float shortSide = input.nextFloat();
        System.out.println("Dikdortgenin uzun kenar uzunluğunu giriniz..." );
        float longSide = input.nextFloat();
        System.out.println("Alan = " + (shortSide * longSide));
        System.out.println("Cevre = " + (2 * shortSide + 2 * longSide));
    }
}
