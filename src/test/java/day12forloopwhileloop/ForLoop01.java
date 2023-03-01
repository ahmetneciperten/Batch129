package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {

    public static void main(String[] args) {

        /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X


          Scanner input=new Scanner(System.in);

        System.out.println("Satır(row) sayısını giriniz..");
        int row=input.nextInt();

        System.out.println("Sütun ((colomn) sayısını giriniz.. ");

        int colomn=input.nextInt();

        for(int i=1;i<=row;i++){

            for(int k=1; k<=colomn; k++){
                System.out.print("X ");
            }
            System.out.println();
        }
*/

        Scanner input=new Scanner(System.in);
        System.out.println("Satir sayisini giriniz..");
        int satir=input.nextInt();
        System.out.println("Sutun sayisini giriniz..");
        int sutun=input.nextInt();

        for(int i=1;i<=satir;i++){
            for(int k=1;k<=sutun;k++){
                System.out.print("V ");

            }
            System.out.println();
        }





    }

    }



