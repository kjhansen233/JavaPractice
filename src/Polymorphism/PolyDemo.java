package Polymorphism;

import java.util.ArrayList;

public class PolyDemo {

    public static void main (String[] args){
        ArrayList<Shape> myShapes = new ArrayList<Shape>();
        Shape a = new Circle(3);
        myShapes.add(a);
        a = new Square(3);
        myShapes.add(a);

        for(Shape s: myShapes){
            System.out.println(s.getType()+" with area of: "+s.getArea());
        }
    }
}
