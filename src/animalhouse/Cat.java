package animalhouse;

public class Cat extends Mammal {

    public Cat() {
        //Call the mammal constructor
        super();
    }

    //override the Mammal speak method
    public void speak() {
        System.out.println("Meow!");
    }
}
