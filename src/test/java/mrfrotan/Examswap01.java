package mrfrotan;

public class Examswap01 {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println("Swaptan once sayi1: " + sayi1 + "sayi2 : "+ sayi2);

        //1. Method

        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("Swaptan sonra sayi1: " + sayi1 + "sayi2 : "+ sayi2);


    }

}
