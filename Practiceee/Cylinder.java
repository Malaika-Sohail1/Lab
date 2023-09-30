package Practiceee;

public class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {
        System.out.println("A no argument cylinder");
    }

    public Cylinder(int height) {
        this.height = height;
        this.radius=1;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double computeArea(){
        return (2*3.14*radius*height)+2*3.14*(radius*radius);
    }
    public double computeVolume(){
        return 3.14*radius*radius*height;
    }
}
