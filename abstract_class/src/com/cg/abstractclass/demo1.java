package com.cg.abstractclass;
 abstract class dress{
	abstract void type ();
}
class menswear extends dress{
	void type() {
		System.out.println("It is a mens wear");
	}
}


public class demo1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menswear coat = new menswear();
		coat.type();

	}
}
