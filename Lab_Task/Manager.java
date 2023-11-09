package Lab_Task;

import java.util.ArrayList;

public class Manager {
    ArrayList<Taxi> list1 = new ArrayList<>();

    public Taxi availableRide(ArrayList<Taxi> taxi, Location distance) {
        int minIndex = -1;
        double minDistance = 100000;

        for (int counter = 0; counter < taxi.size(); counter++) {
            int x = taxi.get(counter).getLocation().getX() - distance.getX();
            int y = taxi.get(counter).getLocation().getY() - distance.getY();
            double loc = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            if (loc < minDistance) {
                minDistance = loc;
                minIndex = counter;
            }
        }

        if (minIndex != -1) {
            return taxi.get(minIndex);
        } else {
            return null;
        }

    }
    public double fare(Location pickup, Location drop){
        int x= pickup.getX()-drop.getX();
        int y=pickup.getY()-drop.getY();
        double distance= Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        double fare=distance*200;
        return fare;

    }

    public int ascendingOrder(ArrayList<Taxi> taxi,Location location){

    }
}




