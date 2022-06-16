package private_access_modifiers_demo;

public class Test1 {
	private int i=10;
	private void show() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		t1.show();
		System.out.println(t1.i);

	}

}
//example of private access modifier- within class
//private access modifier access within a class only

/*private access modifier can't be accessed 
  -within same package
  -outside package by subclass only
  - and outside package 
 */