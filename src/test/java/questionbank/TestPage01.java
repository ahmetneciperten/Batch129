package questionbank;

public class TestPage01 {

    public static void main(String[] args) {

        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        }while(num<2);

        num=1;
        while(num<2) {
            System.out.print(num + " ");
            num+=1;
        }

         num=1;
        while(num<=1) {
            System.out.print(num + " ");
            num++;
        }

        for( num=1; num<2; num++){
            System.out.print(num + " ");
        }
    }
}

