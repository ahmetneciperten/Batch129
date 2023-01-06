package practice_daytime.daytime04;

import java.util.Scanner;

public class C01ForLoop {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen String bir ifade veriniz.");
        String str=input.nextLine().toLowerCase();
        int sayac=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'){

                sayac++;

            } else if (str.charAt(i)=='c'){
                break;

            }

        }
        System.out.println("c oncesi 'a'larin sayisi :"+ sayac);
    }
}
