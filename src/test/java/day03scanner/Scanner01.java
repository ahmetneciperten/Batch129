package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    //Kullanicidan data alip kodlarimizda kullanacagiz.


    public static void main(String[] args) {
        //1.Adim: Scanner Classtan object oluştur.
         Scanner input = new Scanner(System.in);
         //2. Adim: Kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz");
        //3.Adim: Uygun methodu kullanarak kullanicinin verdigi datayi memorye yerleştiriniz.

       byte age = input.nextByte();
        System.out.println(age);

    }
}
