public class FreeExxample03 {
    public static void main(String[] args) {

        String s="madagaskar";
       String t= s.replace("a", "");

        System.out.println(t);

        //2, yol:
        for(int i=0;i<s.length();i++){

char ch= s.charAt(i);

            if (ch!='a'){
                System.out.print(ch);
            }
        }
        System.out.println();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='a'){
                continue;
            }
            System.out.print(ch);
        }

    }
}
