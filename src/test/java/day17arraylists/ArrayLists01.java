package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {
       /*
     1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
     2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
        List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
     3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
        List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
     4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
          i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
          ii) Array'ler cok hizli calisir.
          iii) Array'ler memory'de cok az yer kaplar.
    */

    public static void main(String[] args) {
        //List nasil oluşturulur?
        ArrayList<Integer>ages=new ArrayList<>();

        //List'lere nasil eleman eklenir?
        ages.add(12);
        ages.add(9);
        ages.add(45);

        ages.add(1,99);
        ages.add(2,588);
        System.out.println(ages);

        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);
        ages.addAll(2, newAges);
        System.out.println(ages);

        //Bir list'teki tum elemanlari nasil silebiliriz?

        ages.clear();
        System.out.println(ages);

        //contains () metodu bir elemanın List'te var olup olmadığını nasıl kontrol ederiz?

        boolean r = ages.contains(99);
        System.out.println(r);

        //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //iki Listin esit olabilmesi icin ayni indexte aynı eleman olmalı.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false
        //Example 1: Verilen iki Integer List'te tamamiyla ayni elemanlarin olup olmadigini
        //           kontrol eden kodu yaziniz.

        ArrayList<Integer>nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);


        Collections.sort(nums1);

        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);


    }
}
