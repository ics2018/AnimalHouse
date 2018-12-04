package animalhouse;

import javax.swing.*;

public class AnimalHouse {

    public static void main(String[] args) {
//Create an array of mammals
        Mammal theArray[] = new Mammal[5];

        String choice;

//Fill the array
        for (int i = 0; i < 5; i++) {
            choice = JOptionPane.showInputDialog("Mammal #" + (i + 1) + "\n"
                    + "1 - Dog\n"
                    + "2 - Cat\n"
                    + "3 - Horse\n"
                    + "4 - Pig");
            if (choice.equals("1")) {
                theArray[i] = new Dog();
            }
            if (choice.equals("2")) {
                theArray[i] = new Cat();
            }
            if (choice.equals("3")) {
                theArray[i] = new Horse();
            }
            if (choice.equals("4")) {
                theArray[i] = new Pig();
            }
        }

//Get all 5 mammals to speak
        for (int i = 0; i < 5; i++) {
            theArray[i].speak();
        }
    }
}
