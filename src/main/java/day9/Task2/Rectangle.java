package day9.Task2;

import java.security.PublicKey;

public class Rectangle extends Figure{
    private int height;
    private int width;

    public Rectangle (int height,int width, String color){
        super(color);
        this.height = height;
        this.width = width;
    }

    public double area(){
        return height*width;
    }
    public double perimeter(){
        return 2*(height+width);
    }
}
