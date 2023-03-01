package mrfrotan;

public class Varargs {

    public static void main(String[] args) {

        // bir da fazlasayileri toplayan bir method lsutrun
        add(3);
        add(3,4);
        add(4,5,6);
        add(1,2,3,4 ,5,6,7,8,9);

        // array ===

    }

    public static void add(int... a){

        int sum=0;//local variable

        for (int w:a){
            sum=sum+w;
        }
        System.out.println(sum);

    }
}


