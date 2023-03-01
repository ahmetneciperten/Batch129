package questionbank;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        // String s = "Java is Java";
        // System.out.println(s.toLowerCase().lastIndexOf("j"));

        String s = "Learn";
        String t = "Java";

        //  System.out.println((s.concat(t)).length());
        //System.out.println("" + s.length() + t.length());
        // System.out.println(s.concat(String.valueOf(t.length())));
        // System.out.println(s.length() > s.charAt(2));
        int product = 1;
        for (int i = 5; i >= 0; i--) {
            product = product * i;
        }
        System.out.println(product);
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print("Hello  ");
        }
        System.out.println();

        for (char i = 'f'; i > 'a'; i--) {
            System.out.print(i + " ");
            i--;
        }

        //  System.out.println();
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = (5 - i); j > 1; j--) {
                System.out.print(i + j);
            }
            System.out.println();


           // int sum = 0;
          //  for (int i = 10;
            //     i > 0; i = i - 5) {
            //    sum = sum + i;

             //   System.out.println(sum);
            Scanner scan = new Scanner(System.in);
            System.out.println("Başlangıç değerini giriniz");
            int bas = scan.nextInt();
            System.out.println("Bitis değerini giriniz");
            int bit = scan.nextInt();
            int carpim = 1;
            int toplam = 0;
            if(bas<=bit) {
                for( i=bas; i<=bit; i++) {
                    toplam = toplam + i;
                }
            } else {
                for(i=bas; i>=bit; i--) {
                    carpim = carpim * i;
                }
            }
            System.out.print(carpim);
            System.out.println(toplam);
            scan.close();
            }
        }
    }