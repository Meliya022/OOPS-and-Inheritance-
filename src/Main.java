//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create cast lists for Movie and TvShow
        ArrayList<String> movieCast = new ArrayList<>();
        movieCast.add("Actor A");
        movieCast.add("Actor B");

        ArrayList<String> tvShowCast = new ArrayList<>();
        tvShowCast.add("Actor C");
        tvShowCast.add("Actor D");

        // Create a Movie object
        Movie movie = new Movie("Inception", "PG-13", "Christopher Nolan", movieCast, 148, "A mind-bending thriller.", 829.9);
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Grossing: $" + movie.getGrossing() + " million");

        // Create a TvShow object
        TvShow tvShow = new TvShow("Stranger Things", "MA", "Duffer Brothers", tvShowCast, 4, 34);
        System.out.println("TV Show Title: " + tvShow.getTitle());
        System.out.println("Seasons: " + tvShow.getSeasons());
    }

    // Media class
    static class Media {
        private String title;
        private String rating;
        private String director;
        private ArrayList<String> cast;

        public Media(String title, String rating, String director, ArrayList<String> cast) {
            this.title = title;
            this.rating = rating;
            this.director = director;
            this.cast = cast;
        }

        // Getters and Setters
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }

        public String getRating() { return rating; }
        public void setRating(String rating) { this.rating = rating; }

        public String getDirector() { return director; }
        public void setDirector(String director) { this.director = director; }

        public ArrayList<String> getCast() { return cast; }
        public void setCast(ArrayList<String> cast) { this.cast = cast; }
    }

    // Movie class
    static class Movie extends Media {
        private int length;
        private String description;
        private double grossing;

        public Movie(String title, String rating, String director, ArrayList<String> cast, int length, String description, double grossing) {
            super(title, rating, director, cast);
            this.length = length;
            this.description = description;
            this.grossing = grossing;
        }

        // Getters and Setters
        public int getLength() { return length; }
        public void setLength(int length) { this.length = length; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public double getGrossing() { return grossing; }
        public void setGrossing(double grossing) { this.grossing = grossing; }
    }

    // TvShow class
    static class TvShow extends Media {
        private int seasons;
        private int episodes;

        public TvShow(String title, String rating, String director, ArrayList<String> cast, int seasons, int episodes) {
            super(title, rating, director, cast);
            this.seasons = seasons;
            this.episodes = episodes;
        }

        // Getters and Setters
        public int getSeasons() { return seasons; }
        public void setSeasons(int seasons) { this.seasons = seasons; }

        public int getEpisodes() { return episodes; }
        public void setEpisodes(int episodes) { this.episodes = episodes; }
    }
}
