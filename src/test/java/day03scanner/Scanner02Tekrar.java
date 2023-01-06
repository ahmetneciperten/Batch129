package day03scanner;

import java.util.Scanner;

public class Scanner02Tekrar {


    public static void main(String[] args) {
    /*    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");

        byte yas = input.nextByte();
        System.out.println("Yasiniz :" + yas);


        System.out.println("Uzunlugu giriniz. ");
        double length = input.nextDouble();
        System.out.println("Genisligi giriniz.");
        double widht = input.nextDouble();
        System.out.println("Yuksekligi giriniz.");
        double height = input.nextDouble();

        System.out.println("Dikdortgen hacmi :" + length * widht * height);

        System.out.println("Dikdortgen hacmi  "+Dikdortgenhacmi(12, 3, 5));
        System.out.println("Dikdortgen hacmi  "+Dikdortgenhacmi(length,widht,height));
    }

    public static double Dikdortgenhacmi(double length, double widht, double height){
        return  length*widht*height;
    }
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Çift veya tek oldugunu anlamak icin bir sayi giriniz:");

        int num=scan.nextInt();

                if(num%2==0) {
                    System.out.println("ÇİFT");
                }else {
                    System.out.println("TEK");
                }



















    }
}




