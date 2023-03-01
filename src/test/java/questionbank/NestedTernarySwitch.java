package questionbank;

import java.util.Locale;

public class NestedTernarySwitch {
    public static void main(String[] args) {

        String str1 = "ALİ can";
        String str2 = "Ali";
        System.out.println((str1.replace(str1.substring(0),"ali CAN")));
        System.out.println();

        String b = "Ali 12 ?_";
        System.out.println(b.replaceAll("\\d", "*"));


        String str="sarı kanarya";
        System.out.println(str.length());
        System.out.println(str.replace("","/"));
        System.out.println(str.contains("s"));
        int i = 1;
        int j = 0;
        switch (i) {
            case 2:
                j += 6;
            case 4:
                j += 1;
            case 1:
                j += 4;
            default:
                j += 2;
        }
        System.out.println("j = " + j);
    }
}
