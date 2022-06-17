package exception_handeling;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyClass2.myMethod());

	}
	public static int myMethod()
	{
		try
		{
			return 0;
		}
		finally
		{
			System.out.println("this is finally block");
			System.out.println("finally block ran even after return statement");
		}
	}

}
//try can be followed by either catch block or finally block
//finally block doesn't executed 1)2)3) 