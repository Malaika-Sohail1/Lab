package Lab_03;

public class Music {
    private String title;
    private Artist artistName;
    private double duration;
    private String genera;
    private Date dateAdded;

    Music(String title, Artist artistName, double duration, String genera, Date dateAdded) {
        this.title = title;
        this.artistName = artistName;
        this.duration = duration;
        this.genera = genera;
        this.dateAdded = dateAdded;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenera() {
        return genera;
    }

    public void setGenera(String genera) {
        this.genera = genera;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Artist getArtistName() {
        return artistName;
    }

    public void setArtistName(Artist artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        String musicDetails = String.format("%-17s\t%-40s\t%.2f\t%17s\t%13s", title, artistName, duration, genera, dateAdded);
        return musicDetails;
    }

    public boolean equals(Object O) {
        Music song=(Music) O;
        if(song.getArtistName().getName().equals(this.getArtistName().getName())&&song.getTitle().equals(this.title))
        {
            return true;
        }
        else
            return false;
    }
}