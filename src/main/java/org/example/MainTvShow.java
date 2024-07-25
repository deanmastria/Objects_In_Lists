package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTvShow {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();              //Array list stores book objects
        Scanner scanner = new Scanner(System.in);                   //Scanner object to read user input

        while (true) {                                              //Loop to read details from users
            System.out.print("Name of the show: ");
            String showName = scanner.nextLine().trim();            //read and trim the title input

            if (showName.isEmpty()) {                               //Checks if title is empty to break loop
                break;
            }

            //Reads # of episodes
            System.out.print("How many episodes? (press Enter to skip): ");
            String episodesInput = scanner.nextLine().trim();
            int numberOfEpisodes = 0;  // Initialize numberOfEpisodes to 0
            boolean useOverloadedConstructor = episodesInput.isEmpty(); // Check if input is empty to decide constructor

            if (!useOverloadedConstructor) {   // If input is not empty
                try {
                    numberOfEpisodes = Integer.parseInt(episodesInput);  // Parse the input to an integer
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number entered. Defaulting to 0 episodes.");  // Handle invalid number input
                }
            }

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine().trim();  // Read and trim the genre input
            // Add the TvShow object to the list using the appropriate constructor
            if (useOverloadedConstructor) {
                tvShows.add(new TvShow(showName, genre)); // Using the overloaded constructor
            } else {
                tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
            }
        }

        System.out.println("\nTV Shows entered:");
        for (TvShow tvShow : tvShows) {     // Loop through the tvShows list
            System.out.println(tvShow);
        }

        scanner.close();
    }
}
