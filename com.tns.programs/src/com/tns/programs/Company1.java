package com.tns.programs;

public class Company1 {
	String name;
	public static void main(String[] args) {
		Company1 c = new Company1();
		Company1 c1 = c;	
		c1.name ="C2TC";
		c=null;
		System.out.println(c1.name);
	}

}
