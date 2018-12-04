package animalhouse;

public class Dog extends Mammal {

    public Dog() {
        //call Mammal constructor
        super();
    }

    //override the Mammal speak method
    public void speak() {
        System.out.println("Woof!!");
    }
}
