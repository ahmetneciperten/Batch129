package nighttimeşulehoca02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMethods {

    // Kullanıcıdan 5 sayıdan olusan
// bir liste isteyin.
// listeyi sirala ve tersten yazdir
// listeyi karıştırin ve yazdırin
// 3'er sağa kaydirin ve yazdırin
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen sayi giriniz...");
            arrList.add(input.nextInt());
        }
        System.out.println("arrList = " + arrList);//

// listeyi sirala ve tersten yazdir
        arrList.sort(Collections.reverseOrder());
        System.out.println("tersten arrList =" + arrList);

// listeyi karıştırin ve yazdırin
        Collections.shuffle(arrList);// shuffle random olarak karistirir
        System.out.println("karistirdiktan sonra arrList =" + arrList);

// 3'er sağa kaydirin ve yazdırin
        Collections.rotate(arrList, 3);
        System.out.println("3 saga kaydiktan sonra arrList" + arrList);

        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);

        System.out.println(max);
        System.out.println(min);

        Collections.replaceAll(arrList, max, min);
        System.out.println("max degerlerin yerine min geldikten sonra arrList =" + arrList);

    }
}