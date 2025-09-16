package hybridin;
	class A {
	    void methodA() {
	        System.out.println("Class A method");
	    }
	}
	class B extends A {
	    void methodB() {
	        System.out.println("Class B method");
	    }
	}
	class C extends A {
	    void methodC() {
	        System.out.println("Class C method");
	    }
	}
	class D extends B {
	    void methodD() {
	        System.out.println("Class D method");
	    }
	}

	public class hybridin {
	    public static void main(String[] args) {
	        D obj = new D();
	        obj.methodA(); 
	        obj.methodB();
	        obj.methodD(); 

	        C obj2 = new C();
	        obj2.methodA(); 
	        obj2.methodC(); 
	    }
	}

