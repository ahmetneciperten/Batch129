package freeexample;

public class StringBuilder01 {

    public static void main(String[] args) {

     StringBuilder sb1=new StringBuilder("Yazılım");
        System.out.println(sb1);

        sb1.append(" öğreniyorum").append("!!");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append("computer*öğreniyorum");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuilder sb3=new StringBuilder(10);
        System.out.println("sb3:" + sb3);
        System.out.println();

        sb1.append("").append("Java ile ");
        System.out.println(sb1);

        String cumle="gayretle!!";
        sb1.append(cumle,0,4);
        System.out.println(sb1);
        System.out.println(sb1.charAt(6));

        sb1.charAt(5);
        System.out.println(sb1);

        sb1.delete(5,11);
        System.out.println(sb1);

        sb1.deleteCharAt(17);
        System.out.println(sb1);

        System.out.println(sb1.indexOf("Jaa "));
        System.out.println(sb1.indexOf("a",17));
        System.out.println(sb1.indexOf("Nihat"));

    sb1.insert(14,"hey!");
        System.out.println(sb1);

        StringBuilder sb4= new StringBuilder("Java ile IT dünyası");
        String cümle1 = "na merhaba";
        sb4.insert(19,cümle1,0,10);
        System.out.println(sb4);

        System.out.println(sb4.lastIndexOf("h"));
        sb4.replace(4,4," ve Pyhton");
        System.out.println(sb4);

        System.out.println(sb4.lastIndexOf("a"));

        sb4.insert(39,"!!!!");
        System.out.println(sb4);

    }
}
