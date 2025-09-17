package com.tnsif.task5;
		class Calculator {
		    void add(int a, int b) {
		        System.out.println((a + b));
		    } 
		    void add(double a, double b) {
		        System.out.println((a + b));
		    }
		    void add(int a, double b) {
		        System.out.println((a + b));
		    }
		    void add(double a, int b) {
		        System.out.println((a + b));
		    }
		}

		public class Overload {
		    public static void main(String[] args) {
		        Calculator calc = new Calculator();

		        calc.add(10, 20);        
		        calc.add(5.5, 4.5);      
		        calc.add(10, 4.5);       
		        calc.add(5.5, 10);       
		    }
		}

	
