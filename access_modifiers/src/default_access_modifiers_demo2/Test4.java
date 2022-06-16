package default_access_modifiers_demo2;

public class Test4 {
	 int i=10;
	 void show() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t4 = new Test4();
		t4.show();
		System.out.println(t4.i);


}
}
//example of default access modifier- within class
/*default access modifier access 
  - within a class only
  - within same package
  */

/*default access modifier can't be accessed 
-outside package by subclass only
- and outside package 
*/