package day25inheritance;

public class Car extends Vehicle {

    public Car(){
        super(20000);
        System.out.println("Car 1");
    }

    public Car(String make){
        super(20000);
        System.out.println("Car 2: " + make);
    }

}