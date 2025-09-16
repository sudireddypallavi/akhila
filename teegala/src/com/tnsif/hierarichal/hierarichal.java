package com.tnsif.hierarichal;
		class Animal {
		    void eat() {
		        System.out.println("Animals can eat.");
		    }
		}
		class Dog extends Animal {
		    void bark() {
		        System.out.println("Dog barks.");
		    }
		}
		class Cat extends Animal {
		    void meow() {
		        System.out.println("Cat meows.");
		    }
		}
		class Cow extends Animal {
		    void moo() {
		        System.out.println("Cow moos.");
		    }
		}

		public class hierarichal {
		    public static void main(String[] args) {
		        
		        Dog d = new Dog();
		        d.eat();   
		        d.bark();  

		       
		        Cat c = new Cat();
		        c.eat();  
		        c.meow();  
		        Cow cw = new Cow();
		        cw.eat();  
		        cw.moo();  
		}
		}
	

	


