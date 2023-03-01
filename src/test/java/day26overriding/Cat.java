package day26overriding;



public class Cat extends Mammal {




    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public Animal create() {
        return super.create();
    }

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    public void meow(){
        System.out.println("Cats meow...");

    }

    @Override
    public Integer multiply(int a, int b) {
        return super.multiply(a, b);
    }
}
