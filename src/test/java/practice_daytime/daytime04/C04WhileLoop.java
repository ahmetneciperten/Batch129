package practice_daytime.daytime04;

import java.util.Scanner;

public class C04WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        while (sayac < 11 && toplam < 501) {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz.");
            sayi = input.nextInt();//her adimda gözüksün diye loop icinde yazdik.
            toplam += sayi;
            sayac++;

        }
            if (toplam > 500) {
                System.out.println(sayac + "adet sayi giriniz. Toplami " + toplam);
            } else
                System.out.println("Bu kadar sayi yeter. " + sayac + "  adet sayi girdiniz Toplam " + toplam);


        }
    }




