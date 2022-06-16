package protected_access_modifier3;

public class Test6 {
	protected int i=10;
	protected void show() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t6=new Test6();
		t6.show();
		System.out.println(t6.i);

	}

}
//example of protected access modifier- within class

/*protected access modifier access
  -within a class only
  -within same package
  -outside package by subclass only

/*protected access modifier can't be accessed 
-  outside package 
*/