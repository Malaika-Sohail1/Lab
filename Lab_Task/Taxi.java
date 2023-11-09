package Lab_Task;

public class Taxi {
    private int id;
    private Location location;
    private boolean availability;

    public Taxi(int id, Location location, boolean availability) {
        this.id = id;
        this.location = location;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public String toString(){
        return String.format("%d %s %s",id,location,availability);
    }


}
