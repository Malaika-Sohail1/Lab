package week_03_practice;

public class Rectangle {
    private int length;
    private int width;

    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
