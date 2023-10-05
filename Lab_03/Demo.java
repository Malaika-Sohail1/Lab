package Lab_03;

import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
    /*    Music music1 = new Music("Despecito", new Artist("Louis", "Peureta", 4.5), 2.0, "Unknown", new Date(12, 10, 2010));
        Music music2 = new Music("filhaal", new Artist("Prank", "Indian", 5), 2.8, "Unknown", new Date(13, 1, 2001));
        Music music3 = new Music("Aitebaar", new Artist("Atif", "Pakistani", 7.5), 13, "Unknown", new Date(17, 4, 2005));
        Music music4 = new Music("Aitebaar", new Artist("Atif", "Pakistani", 7.5), 13, "Unknown", new Date(17, 4, 2005));

        //System.out.println(music1);
       // System.out.println(music2);
        //System.out.println(music3);
        Music list[] = new Music[4];
        list[0] = music1;
        list[1] = music2;
        list[2] = music3;
        list[3] = music4;

        for (int i = 0; i < 4; i++)
            System.out.println(list[i]);


        boolean M = music1.equals(music2);
        System.out.println(M);

        boolean J = music3.equals(music4);
        System.out.println(J);
    }

}*/
        //Check errors
        //System.out.println("Enter an integer");
        System.out.println("Enter day");
        Scanner sc = new Scanner(System.in);
           /* int no1=sc.nextInt();
            System.out.println("Entered integer is: " +no1);*/
        int day = sc.nextInt();
        System.out.println("Enter Month");
        int month = sc.nextInt();
        System.out.println("Enter Year");
        int year = sc.nextInt();
        Date date = new Date(day,month,year);
        System.out.println(date);
    }
}
