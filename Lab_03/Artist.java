package Lab_03;

public class Artist {
    private String name;
    private String nationality;
    private double rating;

    public Artist(String artistName, String nationality, double rating) {
        this.name = artistName;
        this.nationality = nationality;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String artistName) {
        this.name = artistName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        String A=String.format("%-20s%-20s%.2f",name,nationality,rating);
        return A;
    }
}


