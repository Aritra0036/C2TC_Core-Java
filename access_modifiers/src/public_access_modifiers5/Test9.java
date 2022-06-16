package public_access_modifiers5;

public class Test9 {

	     int i=10;
		 void show() {
			System.out.println("Hello World");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Test9 t9 = new Test9();
			t9.show();
			System.out.println(t9.i);
	}

}
//example of public access modifier- within class

/*public access modifier access 
- within a class only
- within same package
-outside package by subclass only
- and outside package 
*/

