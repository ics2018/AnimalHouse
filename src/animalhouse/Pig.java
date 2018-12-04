package animalhouse;

public class Pig extends Mammal {

    public Pig() {
        //Call Mammal constructor
        super();
    }

    //override the Mammal speak method
    public void speak() {
        System.out.println("Oink!");
    }
}
