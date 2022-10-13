package Polymorphism;

public class Circle implements Shape{
    private double radius;
    private final String type = "Polymorphism.Circle";
    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String getType(){
        return this.type;
    }
}
