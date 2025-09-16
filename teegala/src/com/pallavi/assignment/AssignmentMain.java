package com.pallavi.assignment;
class Employee {
	    private String name;
	    private int employeeId;
	    private double salary;

	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    public void displayInfo() {
	        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + salary);
	    }
	}
	class Manager extends Employee {
	    private String department;

	    public Manager(String name, int employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Department: " + department);
	    }
	}
	class Developer extends Employee {
	    private String programmingLanguage;

	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Programming Language: " + programmingLanguage);
	    }
	}
	class EmployeeUtilities {
	    public static void printEmployeeDetails(Employee emp) {
	        emp.displayInfo();
	        System.out.println("------------------------");
	    }
	}

	public class AssignmentMain {
	    public static void main(String[] args) {
	        Manager manager = new Manager("Alice", 101, 80000, "IT");
	        Developer developer = new Developer("Bob", 102, 60000, "Java");

	        EmployeeUtilities.printEmployeeDetails(manager);
	        EmployeeUtilities.printEmployeeDetails(developer);
	    }
	}



