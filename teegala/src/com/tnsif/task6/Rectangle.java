package com.tnsif.task6;
class Rectangle extends Shape {
    private int length, width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void calculateArea() {
        super.area = length * width;
    }
}

