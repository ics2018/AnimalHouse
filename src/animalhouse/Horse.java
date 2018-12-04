package animalhouse;

public class Horse extends Mammal {

    public Horse() {
        //Call Mammal constructor
        super();
    }

    //override the Mammal speak method
    public void speak() {
        System.out.println("Winnie!");
    }
}
