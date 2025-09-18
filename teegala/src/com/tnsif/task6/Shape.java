package com.tnsif.task6;
public abstract class Shape {
	protected float area;
	abstract void calculateArea();
	public void show()
	{
		System.out.println("The area of Shape is:" +area);
		}
	}

