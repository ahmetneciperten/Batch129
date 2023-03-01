package day36lambda;

public class Utils {

public static int getLengthSquare(String s){
    return  s.length()*s.length();


}
        public static boolean isLengthEven(String s){
            return s.length() % 2 == 0;
        }
        public static String getLastChar(String s){
    return s.substring(s.length()-1);
        }
        public static void printInTheSameLineWithSpace(Object obj){
            System.out.print(obj+" ");

        }

    public static void yazdir(Object a) {

    }
    public static int kareBul(int a){
    return a*a;
    }
public static boolean isNumberEven(int x){
    return x%2==0;
}

    public static int getSumOfDigits(int a) {
    return a;
    }
}

