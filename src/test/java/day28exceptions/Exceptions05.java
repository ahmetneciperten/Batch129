package day28exceptions;

public class  Exceptions05 {

    public static void main(String[] args) {

        int a=16;
        int b=2;
        String s="My Java";
        getCharFromString(s,a,b);

    }

    public static void getCharFromString(String s,int a,int b){

        try{
        int idx=a/b;
        char ch = s.charAt(idx);
        System.out.println(ch);
        }catch(ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }
    }
    }


