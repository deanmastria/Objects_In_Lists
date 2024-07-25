package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();  // Create an ArrayList to store Animal objects
        Scanner scanner = new Scanner(System.in);       // Create a Scanner object to read user input

        // Loop to read animal details from the user
        while (true) {
            System.out.print("Enter the name of your animal (or press Enter to stop): ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {  // If name is empty, break the loop
                break;
            }

            boolean isDog = false;
            // Loop to read if the animal is a dog
            while (true) {
                System.out.print("Is it a dog? (yes/no): ");
                String isDogInput = scanner.nextLine().trim().toLowerCase();

                if (isDogInput.equals("yes")) {
                    isDog = true;
                    break;
                } else if (isDogInput.equals("no")) {
                    isDog = false;
                    break;
                } else {
                    System.out.println("Please enter 'yes' or 'no'.");
                }
            }

            animals.add(new Animal(name, isDog));  // Add the Animal object to the list
        }

        // Print header and the details of the animals entered
        System.out.println("\nAnimals entered:");
        for (Animal animal : animals) {  // Loop through the animals list
            System.out.println(animal);  // Print each Animal object using its toString method
        }

        scanner.close();  // Close the scanner
    }
}