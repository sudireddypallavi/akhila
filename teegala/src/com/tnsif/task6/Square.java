package com.tnsif.task6;
class Square extends Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }
    public void calculateArea() {
        super.area = side * side;
        }
}


