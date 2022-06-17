package String_inbuilt;

public class ContainsExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="what do you know about me";
		System.out.println(name.contains("do you know"));
		System.out.println(name.contains("about"));
		System.out.println(name.contains("hello"));
		
		String str="Hello T#E#C#H#N#O#S#E#R#V#E@2.0 readers";
		boolean iscontains= str.contains("T#E#C#H#N#O#S#E#R#V#E");
		System.out.println(iscontains);
		System.out.println(str.contains("TECHNOSERVE"));

	}

}
