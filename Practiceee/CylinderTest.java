package Practiceee;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        Cylinder c2=new Cylinder(14);
        Cylinder c3=new Cylinder(10,12);

        c1.setRadius(2);
        c1.setHeight(15);
        System.out.println("Area of c1: "+c1.computeArea());

        System.out.println("Radius of c2 is: "+c2.getRadius());
        System.out.println("Height of c2 is "+c2.getHeight());
        System.out.println("Area of c2: "+c2.computeArea());
        System.out.println("Volume of c2 is: "+c2.computeVolume());

        System.out.println("Area of c3:"+c3.computeArea());
        System.out.println("Volume of c3: "+c3.computeVolume());
    }
}
