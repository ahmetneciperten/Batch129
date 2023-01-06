public class FreeExample02 {
    public static void main(String[] args) {

        String s = "Tranvay";

        for (int i = 0; i < s.length(); i++) {

            char ch=s.charAt(i);
            if (ch=='a') {
                break;
            }
            System.out.print(ch);
        }

        System.out.println();

        String t = "Germany";
        for (int i = t.length()-1; i > 0; i--) {
            if (t.charAt(i) == 'a') {
                break;

            }

            System.out.print(t.charAt(i));
            ;

        }
    }
}
