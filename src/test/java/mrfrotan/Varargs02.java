package mrfrotan;

public class Varargs02 {

        public static void main(String[] args) {

            // Kac tane ill ismi verilirse verilsin
            // iclerinden en Uzun olani yazdiran bir method olusturun
            String ill1 = "Adana";
            String ill2 = "ankara";
            String ill3 = "Istanbul";
            String ill4 = "Bursa";
            String ill5 = "cihan";
            enUzunIllIsmi(ill1,ill2,ill3,ill4,ill5);
            enUzunIllIsmi("adana","ankara","Istanbul","Bursa","cihan");
        }

        public static void enUzunIllIsmi (String ...str){
            String enUzunIllIsim="";//0

            for (String w:str){
                if (w.length() >enUzunIllIsim.length()){// 5>0
                    enUzunIllIsim=w;
                }
            }

            System.out.println("EnUzunIllIsmi : "+ enUzunIllIsim);

        }
    }



