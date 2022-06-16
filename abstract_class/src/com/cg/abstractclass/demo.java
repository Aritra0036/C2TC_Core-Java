package com.cg.abstractclass;

abstract class bike{
	abstract void run();
	
}

class honda extends bike{
	void run() {
		System.out.println("It is running safely");
	}
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honda h=new honda();
		h.run();

	}

}
