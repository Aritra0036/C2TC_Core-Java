package Polymorphism;
 class Add{
    static int add(int a,int b)
	{
		return a+b;
	}
    static double add(double a,double b)
	{
		return a+b;
	}
}
public class TestOverLoding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add.add(11,11));
		System.out.println(Add.add(12.4,6.2));

	}

}
