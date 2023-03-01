package questionbank;

public class WhileLoop {
    public static void main(String[] args) {

         int num = 1;
        while(num<1) {
            System.out.print(num + " ");
            num++;
        }

         num = 1;
        while(num<=1) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
         num = 1;
        while(num==1) {
            System.out.print(num + " ");
            num++;
        }
        for(int i=1; i<10; i=i+1) {
            if(i%3==0) {
                System.out.print(i + " ---------------------------------");
            }
            System.out.println();
        }
        int sum = 0;
         num = 1;
        while(num<5) {
            sum = sum + num;
            num++;
        }
        System.out.println(sum);
        System.out.println();
         num = 1;
        do {
            System.out.print(num + " ");
            num++;
        }while(num<4);

        System.out.println();






    }
}
