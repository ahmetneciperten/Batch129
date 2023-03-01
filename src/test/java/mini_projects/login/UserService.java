package mini_projects.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




    public class UserService {
        List<String> usernameList = new ArrayList<>();
        List<String> emailList = new ArrayList<>();
        List<String> passwordList = new ArrayList<>();

        public void showMenu(){
            System.out.println("==TECHPROEDUCATION===");
            System.out.println("1-Uye Ol");
            System.out.println("2-Giris Yap");
            System.out.println("3-Cikis");
            System.out.println("Secimizi giriniz:");
        }

        public void register(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ad-soyad giriniz");
            String name = scanner.nextLine();


            String username;
            boolean existUsername;
            do {
                System.out.println("Kullanici adini giriniz");
                username = scanner.nextLine();
                existUsername = usernameList.contains(username);
                if(existUsername){
                    System.out.println("Bu username daha once kullanilmistir. Yeniden deneyiniz");
                }
            }while (existUsername);


            String email;
            boolean existEmail;
            boolean isValid;

            do {
                System.out.println("Email giriniz");
                email = scanner.nextLine();
                isValid=validateEmail(email);

                existEmail = emailList.contains(email);
                if(existEmail){
                    System.out.println("Bu email daha once kullanilmistir. Yeniden deneyiniz");
                    isValid=false;
                }

            }while(!isValid);


            String password;
            boolean isValidPsw;

            do {
                System.out.println("Sifre giriniz");
                password = scanner.nextLine();
                isValidPsw = validatePassword(password);

            }while (!isValidPsw);








        }

        public static boolean validateEmail(String email){
            boolean isValid;

            boolean space =  email.contains(" ");
            boolean isContainAt =  email.contains("@");

            if(space){
                System.out.println("Email bosluk icermemeli");
                isValid=false;
            } else if (!isContainAt) {
                System.out.println("Email @ icermelidir");
                isValid=false;
            }else {
                String firstPart = email.split("@")[0];
                String secondPart = email.split("@")[1];

                boolean checkFirst = firstPart.replaceAll("[A-Za-z0-9-._]","").length()==0;
                boolean checkSecond = secondPart.equals("gmail.com")||
                        secondPart.equals("yahoo.com")||
                        secondPart.equals("hotmail.com");

                isValid = checkFirst && checkSecond;

            }
            return isValid;
        }

        public static boolean validatePassword(String password){
            boolean isValid;

            boolean space = password.contains(" ");
            boolean lengthGt6 =  password.length()>=6;
            boolean existUpper = password.replaceAll("[^A-Z]","").length()>0;
            boolean existLower = password.replaceAll("[^a-z]","").length()>0;
            boolean existDigit = password.replaceAll("[\\D]","").length()>0;
            boolean existSymbol = password.replaceAll("[\\P{Punct}]","").length()>0;

            if(space){
                System.out.println("Sifre bosluk iceremez");
            } else if (!lengthGt6) {
                System.out.println("Sifre en az 6 karakter icermelidir");
            } else if (!existUpper) {
                System.out.println("Sifre en az 1 buyuk harf icermelidir");
            } else if (!existLower) {
                System.out.println("Sifre en az 1 kucuk harf icermelidir");
            } else if (!existDigit) {
                System.out.println("Sifre en az 1 rakam icermelidir");
            } else if (!existSymbol) {
                System.out.println("Sifre en az 1 sembol icermelidir");
            }

            isValid = !space && lengthGt6 && existUpper && existLower && existDigit && existSymbol;

            return isValid;
        }







    }

