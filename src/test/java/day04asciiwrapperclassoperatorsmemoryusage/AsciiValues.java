package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {
    //Java da her karakterin sayısal bir değeri vardır.
    //Bu değerler ASCII Değer'ler olarak adlandırılır.
    //Bu değerlerin tamamının bulunduğu tabloya ASCII Table denir.

    public static void main(String[] args) {
  //Herhangi bir characterin ASCII degerini bulmak icin  o karakteri "int" data typeinda bir variable in içine koyunuz.
        int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
//Javada charlari matematiksel islemlerde kullanırsaniz, Java o charlarin ASCII degerlerini kullanir.
        System.out.println(c1 + c2);//138

    }
}
