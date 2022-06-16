package com.tns.programs;

public class Employee1 {
	int id;
	String name;
	float salary;
	Employee1(int id,String name,float salary){
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
		Employee1 e1 = new Employee1(101,"raj",45000);
		Employee1 e2 = new Employee1(102,"ari",50500);
		Employee1 e3 = new Employee1(103,"san",30500);
		e1.display();
		e2.display();
		e3.display();
	}
   }
