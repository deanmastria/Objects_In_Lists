package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();       // Create an ArrayList to store Book objects
        Scanner scanner = new Scanner(System.in);       // Create a Scanner object to read user input

        // Loop to read book details from the user
        while (true) {
            System.out.print("Title of the book: ");
            String title = scanner.nextLine().trim();

            if (title.isEmpty()) {            // If the title is empty, break the loop to stop reading inputs
                break;
            }

            // Variables to store the number of pages and publication year
            int numberOfPages = 0;
            int publicationYear = 0;
            boolean useOverloadedConstructor = false;            // Flag to determine whether to use the overloaded constructor

            // Prompt the user to enter the number of pages
            System.out.print("Number of pages (press Enter to skip): ");
            String pagesInput = scanner.nextLine().trim();            // Read the pages input and trim any leading/trailing whitespace

            if (!pagesInput.isEmpty()) {            // Check if the pages input is not empty
                try {
                    numberOfPages = Integer.parseInt(pagesInput);     // Parse the input to an integer
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number entered. Defaulting to 0 pages.");        // Handle invalid number input
                }
            } else {
                useOverloadedConstructor = true;     // If input is empty, set the flag to use the overloaded constructor
            }

            System.out.print("Publication year (press Enter to skip): ");
            String yearInput = scanner.nextLine().trim();           // Read the year input and trim any leading/trailing whitespace

            if (!yearInput.isEmpty()) {
                try {
                    publicationYear = Integer.parseInt(yearInput);                    // Parse the input to an integer
                } catch (NumberFormatException e) {
                    System.out.println("Invalid year entered. Defaulting to 0.");        // Handle invalid year input
                }
            } else {
                useOverloadedConstructor = true;  // If input is empty, set the flag to use the overloaded constructor
            }

            if (useOverloadedConstructor) {            // Add the Book object to the list using the appropriate constructor
                books.add(new Book(title));           // Use the overloaded constructor that sets default values
            } else {
                books.add(new Book(title, numberOfPages, publicationYear));          // Use the full constructor that takes all parameters
            }
        }

        System.out.print("\nWhat information will be printed? "); //Newline character added
        String printOption = scanner.nextLine().trim().toLowerCase();      // Read the print option input, trim any leading/trailing whitespace, and convert to lowercase
        System.out.println(); // Print a blank line for better formatting


        if (printOption.equals("everything")) {        // Check what information to print based on the user's choice
            System.out.println("Books entered:");        // Print all details of the books
            for (Book book : books) {
                System.out.println(book); // Print each Book object using its toString method
            }
        } else if (printOption.equals("name")) {
            System.out.println("Book titles:");        // Print only the titles of the books
            for (Book book : books) {
                System.out.println(book.getTitle()); // Print the title of each Book
            }
        } else {
            System.out.println("Invalid option. Please enter 'everything' or 'name'.");// Handle invalid print option
        }
        scanner.close();
    }
}
