package com.tnsif.superr;
	class Animal {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    void sound() {
	        System.out.println("Dog barks");
	    }

	    void display() {
	        sound();        
	        super.sound();  
	    }
	}

	public class superr{
	    public static void main(String[] args) {
	        Dog d = new Dog();
	        d.display();
	    }
	}
