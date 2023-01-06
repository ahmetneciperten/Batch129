package day10switchloops;

public class exampleloop01 {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("Lütfen geciniz");
        }
        System.out.println();

        for (int i = 5; i > 1; i--) {
            System.out.println("selam");
        }


        for (int i = 11; i < 145; i++) {
            System.out.print(i);
        }
        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        for (int i = 18; i < 57; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

            for(int i=21; i < 181; i++) {

                if (i % 4 == 0 && i % 6 == 0) {
                    System.out.println(i);
                }
            }
                String s = "ankara";
        
        for(int i=0; i<s.length(); i++){



            String ch = s.substring(i, i+1);
            
            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }
            }



        System.out.println("ah dunyaa");

        }

    }



