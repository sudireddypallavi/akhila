package com.tnsif.task6;
public abstract class ShapeEx {
	protected float area;
	abstract void calculateArea();
	public void show()
	{
		System.out.println("The area of Shape is:" +area);
		}
	}
class Squ extends ShapeEx {
    private int side;
    public Squ(int side) {
        this.side = side;
    }
    public void calculateArea() {
        super.area = side * side;
        }
}
class Rect extends ShapeEx {
    private int length, width;
    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void calculateArea() {
        super.area = length * width;
    }
}