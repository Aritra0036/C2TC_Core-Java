package com.tns.programs;

public class Company3 {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company3 c = new Company3();
		c.name ="C2TC";
		Company3 c1 = c;	
		c=null;
		System.out.println(c1.name);
		//c2 is not initialized so error comes
		//c2 =new Company3();
		//Company3 c2;
	    //c2.name="C2TC";
		//System.out.println(c2.name);
		
	

	}

}
