package day9.Task2;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (height + width);
    }
}
