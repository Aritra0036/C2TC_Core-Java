package com.tns.programs;
public class Cricketer {
   String name="Dhoni";
   int age=39;
   String colour="Brown";
   String role="Batsman";
   String nationality="Indian";
//   Cricketer(String name,int age,String colour,String role, String nationality){
//	   
//   }
   
   void display() {
	   System.out.println("Name is "+name);
	   System.out.println("Age is "+age);
	   System.out.println("Color is "+colour);
	   System.out.println("Role is "+role);
	   System.out.println("Nationality is "+nationality);
	   System.out.println("I Love Cricket");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer c= new Cricketer();
		c.display();
   }
	
}
