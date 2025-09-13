package variables;

public class variable{
		   int myVariable;
		   static int data = 30;
		   
		   public static void main(String args[]){
		      int a = 100;
		      variable obj = new variable();
		      
		      System.out.println("Value of instance variable myVariable: "+obj.myVariable);
		      System.out.println("Value of static variable data: "+variable.data);
		      System.out.println("Value of local variable a: "+a);
		   }
		}


