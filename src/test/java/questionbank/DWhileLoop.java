package questionbank;

import java.util.Scanner;

public class DWhileLoop {

    public static void main(String[] args) {

      /*  int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        }while(num<4);
        System.out.println(


        );
         num = 1;
        do {
            System.out.print(num + " ");
            num++;
        }while(num<1);*/
        System.out.println();

       int  num = 1;
        do {
            System.out.print(num + " ");
            num++;
        }while(num<2);
        System.out.println();

         num = 2;
        do {
            System.out.print(num + " ");
            num--;
        }while(num>2);

        System.out.println();
/*
        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();

            if(!(password.equals("AliCan"))) {
                System.out.println("Yanlış");
            }
        }while(!(password.equals("AliCan")));
        System.out.println("Doğru");

        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();

            if(password.equals("AliCan")) {
                System.out.println("Doğru");
            }else {
                System.out.println("Yanlış");
            }

        }while(!(password.equals("AliCan")));*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String password = scan.nextLine();
        while(!(password.equals("AliCan"))) {
            System.out.println("Yanlış");
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();
        }
        System.out.println("Doğru");


    }
}
