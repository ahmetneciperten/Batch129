package mrfrotan;

public class NoVarargs {
    public static void main(String[] args) {

        // 3 saynin toplayan bir method olsutrun

        ucsayTopla(3,4,5);// argument
        iksayTopla(3,5);
    }

    public static void ucsayTopla(int a, int b, int c){ // parameter
        System.out.println(a+b+c);
    }

    public static void iksayTopla(int a, int b){ // parameter
        System.out.println(a+b);
    }
}

