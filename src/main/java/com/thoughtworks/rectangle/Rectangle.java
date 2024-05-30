package com.thoughtworks.rectangle;

class Rectangle {
    private final int length ;
    private final int breadth;
    Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int area() {
        int areaOfRectangle = length * breadth ;
        return areaOfRectangle;
    }
    
    
}
