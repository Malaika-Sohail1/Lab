package Lab_Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Taxi> list1 = new ArrayList<>();
        Manager m1 = new Manager();

        Taxi t1 = new Taxi(1, new Location(4, 8), true);
        Taxi t2 = new Taxi(2, new Location(9, 2), true);
        Taxi t3 = new Taxi(3, new Location(4, 6), true);

        list1.add(t1);
        list1.add(t2);
        list1.add(t3);

        Location l1 = new Location(1, 2);

        System.out.println(m1.availableRide(list1, l1));
        System.out.println("The fare for your ride is"+m1.fare(new Location(1,2),new Location(2,3)));

//        Collections.sort(ArrayList<Taxi>);
    }
}
