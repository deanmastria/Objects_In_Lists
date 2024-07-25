package org.example;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor with all parameters
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Overloaded constructor with default number of episodes
    public TvShow(String showName, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = 0; // Default value
        this.genre = genre;
    }

    // Getters
    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    // toString method
    @Override
    public String toString() {
        return "The name of the show is " + showName + " with " + numberOfEpisodes + " number of episodes. The genre is " + genre + ".";
    }
}
