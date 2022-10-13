package Polymorphism;

public class Square implements Shape {
    private double length;
    private final String type = "Polymorphism.Square";
    public Square(){};
    public Square(double length){
        this.length=length;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return Math.pow(length,2);
    }

    public String getType(){
        return this.type;
    }
}
