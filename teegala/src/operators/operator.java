package operators;

public class operator {

	public static void main(String[] args) {
		int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b)); 
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b)); 

        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b)); 
        System.out.println("a < b: " + (a < b)); 
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b)); 

        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); 
        System.out.println("x || y: " + (x || y)); 
        System.out.println("!x: " + (!x)); 
       
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b)); 
        System.out.println("a | b: " + (a | b)); 
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a)); 
       
        System.out.println("\nAssignment Operators:");
        int c = a;
        c += b; 
        System.out.println("c += b: " + c);
        c -= b;
        System.out.println("c -= b: " + c);
    }
}

	
		
			   
			


