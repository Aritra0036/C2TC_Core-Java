package com.tns.multithreading;

class Eclipse extends Thread{
	public void run() {
		//for(int i=0; i<5;i++) {
		System.out.println("Eclipse thread Id is:  " +Thread.currentThread().getId());
		System.out.println("Eclipse thread Priority is:  " +Thread.currentThread().getPriority());
		//}
	}
}
class PPT extends Thread{
	public void run() {
		//for(int i=0;i<5;i++) {
		System.out.println("PPT thread Id is:  " +Thread.currentThread().getId());
		System.out.println("PPT thread Priority is:  " +Thread.currentThread().getPriority());
	    //}
    }	
}
class Notepad extends Thread{
	public void run() {
		//for (int i=0;i<5;i++) {
		System.out.println("Notepad thread Id is:  " +Thread.currentThread().getId());
		System.out.println("Notepad thread Priority is:  " +Thread.currentThread().getPriority());
		//}
	}
}

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse obj1= new Eclipse();
		obj1.start();
		obj1.setPriority(6);
		PPT obj2=new PPT();
		obj2.start();
		obj2.setPriority(8);
		Notepad obj3=new Notepad();
		obj3.start();
		obj3.setPriority(9);
		System.out.println("Main thread Id is:  " +Thread.currentThread().getId());
		

	}

}
