package com.thoughtworks.rectangle;

class Rectangle {
    int area;
    public boolean computeArea(int length, int breadth) {
        area = length * breadth ;
        return true;
    }
    public int returnArea(){
        return area;
    }
    
}
