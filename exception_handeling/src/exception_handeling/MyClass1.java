package exception_handeling;
import java.util.*;
public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 ob=new MyClass1();
		try
		{
			  ob.method();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception thrown by meth() method catch in main() method");
		}
		
	}
	public  void method() {
		try
		{
			System.out.println(100/0);
		}
		catch(NullPointerException nullExp)
		{
			System.out.println("We have an Exception "+nullExp);
		}
		finally {
		System.out.println("outside try-catch block");
		}
	}


}
