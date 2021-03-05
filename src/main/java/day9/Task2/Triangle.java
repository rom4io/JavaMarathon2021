package day9.Task2;

public class Triangle extends Figure {
    private int length1;
    private int length2;
    private int length3;

    public Triangle (int length1, int length2, int length3, String color){
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;

    }
    public double area(){
        double halfPerim = perimeter() / 2;
        return Math.sqrt(halfPerim * (halfPerim - length1) * (halfPerim - length2) * (halfPerim - length3));
    }
    public double perimeter(){
        return (length1+length3+length2);
    }

}
