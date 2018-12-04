package animalhouse;

public abstract class Mammal {
    private int age;

    public Mammal() {
        age = 1;
    }

    public void move() {
        System.out.println("Mammal move one step");
    }
//    public void speak(){
//        System.out.println("something");
//    }
    public abstract void speak();
}
