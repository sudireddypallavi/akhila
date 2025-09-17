package com.tnsif.task5;
		class Demo {
		    static int number;
		    static {
		        number = 5;
		        System.out.println("Static Block: number = " + number);
		    }
		    static void show() {
		        System.out.println("Static Method: number = " + number);
		    }
		}

		public class statickey {
		    public static void main(String[] args) {
		    	System.out.println("Main Method: number = " + Demo.number);
		        Demo.show();
		    }
		}


