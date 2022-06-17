package com.tns.multithreading;

class Eclipse2 extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Eclipse Thread Id is"+ Thread.currentThread().getId());
			try {
				sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Multithread1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse2 obj= new Eclipse2();
		obj.start();
	}

}
