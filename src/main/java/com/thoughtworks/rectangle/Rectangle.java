package com.thoughtworks.rectangle;

class Rectangle {
    private final double length ;
    private final double breadth;
    Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        double areaOfRectangle = length * breadth ;
        return areaOfRectangle;
    }
    
    
}
