package private_access_modifiers_demo1;
import private_access_modifiers_demo.Test1;
public class Test3 extends Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Test3 t3=new Test3();
		t3.show();
		System.out.println(t3.i); */

	}

}


//private access modifier- outside package by subclass only

/* private access modifier also can't access outside package by subclass
  so we are getting error.
  
    here extends all the data from class Test1 to Test3 by using extends method
 */