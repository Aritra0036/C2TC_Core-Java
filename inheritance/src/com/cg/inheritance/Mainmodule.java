package com.cg.inheritance;

public class Mainmodule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Mobile mobileobject = new Mobile("windows","windows","recent",16000.00);
	System.out.println(mobileobject.getmodel());
	System.out.println(mobileobject);
	
	Blackberry blackberryobject= new Blackberry("Blackberry","Blackberry","keyone",20000.00);
	System.out.println(blackberryobject.getmodel());
	System.out.println(blackberryobject);

	}

}
