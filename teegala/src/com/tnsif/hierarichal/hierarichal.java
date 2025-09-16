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
		        // Dog object
		        Dog d = new Dog();
		        d.eat();   // From Animal
		        d.bark();  // From Dog

		        // Cat object
		        Cat c = new Cat();
		        c.eat();   // From Animal
		        c.meow();  // From Cat

		        // Cow object
		        Cow cw = new Cow();
		        cw.eat();  // From Animal
		        cw.moo();  // From Cow
		    }
		}
	

	


