package this_keyword;

class demo{
	demo()
	{
		System.out.println("Hello World");
	}
	demo(int x)
	{
		this();
		System.out.println(x);
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo a=new demo(10);

	}

}
