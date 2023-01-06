package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

        //ArrayList olustururken sag tarafa (constructor) ArrayList yazmak zorundasiniz.
//Ama sol tarafa ister "ArrayList" yazin isterseniz de "List" yazin,ikisi de calisir.

        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir Listte kac eleman oldugunu nasil anlarız?

        int numOfElement=initials.size();
        System.out.println(numOfElement);
        //Note: Arraylerden bahsederken "length" kullanın,Listlerden bahsederken "size" kullanın.

        //Bir listten istenen bir eleman nasil alınır?

       char u= initials.get(2);
        System.out.println(u);

        //Verilen bir String Listteki elemanlarin toplam karakter sayisini bulan kodu yazınız.

        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Fethiye");
        cities.add("Almatı");

        //1. Yol:   Recommended
        int sum = 0;

        for (String w : cities) {

            sum = sum + w.length();
            System.out.println(sum);

            //2. Yol:

            int toplam = 0;
            for (int i = 0; i < cities.size(); i++) {
                toplam = toplam + cities.get(i).length();

            }
            System.out.println(toplam);

            //Bir Listteki istenen bir elemanı nasil değiştirebiliriz?
            cities.set(0, "New York");

        }
            System.out.println(cities);


        //Example 2: Maas Listi oluşturunuz ve maaslara %20 zam yapınız.
        List<Double>salary=new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        //1. Yol:
        int idx=0;

       for (Double w : salary){
           salary.set(idx, w*1.20);

          idx++;

        }

       System.out.println(salary);

        //2. Yol:
        for(int i=0;i<salary.size();i++){

            salary.set(i,salary.get(i)*1.20);

        }
        System.out.println(salary);





    }
}
