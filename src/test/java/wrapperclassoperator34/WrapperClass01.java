package wrapperclassoperator34;

public class WrapperClass01 {
  /*  Primitive             Wrapper
    byte     ==>        Byte
    short    ==>        Short
    int      ==>        Integer *****
    long     ==>        Long
    float    ==>        Float
    double   ==>        Double
    boolean  ==>        Boolean
    char     ==>        Character  *****
    */

    public static void main(String[] args) {
        char ch ='A';
        Character wch=ch;
        System.out.println(wch);

        //Ex : short data type’inin en kucuk ve en buyuk degerini ekrana yazdirin
        System.out.println(Short.MIN_VALUE + " " +Short.MAX_VALUE);

    }
}
