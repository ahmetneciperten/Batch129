package day25inheritance;

public class Honda extends Car {

    public Honda(){
        super("Accord");
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        super();//super() yazmasaniz da ayni isi gorur
        System.out.println("Honda 2: " + model + " - " + year);
    }

}