package com.tns.programs;

public class Employee {
	int id;
	String name;
	float salary;
	Employee(int id,String name,float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		//System.out.println("user defined no-argument" + "constructor executed");
	}
    void display() {
    	System.out.println(id +" "+name+"  "+ salary);
    }
   // public class main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"raj",45000);
		Employee e2 = new Employee(102,"ari",50500);
		e1.display();
		e2.display();
		
	}
   }
//}
