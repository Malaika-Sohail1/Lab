package week_03_practice;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(13,12);

        System.out.println("length is "+r1.getLength());
        System.out.println("Width is "+r1.getWidth());
        System.out.println("Area is: "+r1.calculateArea());
        System.out.println("Perimeter is: "+r1.calculatePerimeter());
    }
}
