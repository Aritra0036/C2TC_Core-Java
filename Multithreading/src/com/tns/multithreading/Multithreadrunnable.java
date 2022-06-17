package com.tns.multithreading;

class Eclipse1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Eclipse thread Id is:  " +Thread.currentThread().getId());
		}
	}
}
class PPT1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("PPT thread Id is:  " +Thread.currentThread().getId());
	     }
	}
}
class Notepad1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Notepad thread Id is:  " +Thread.currentThread().getId());
	     }
	}
}

public class Multithreadrunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse1 obj1= new Eclipse1();
		Thread t= new Thread(obj1);
		t.start();
		
		PPT1 obj2=new PPT1();
		Thread t1=new Thread(obj2);
		t1.start();
		
		Notepad1 obj3= new Notepad1();
		Thread t2=new Thread(obj3);
		t2.start();

	}

}
