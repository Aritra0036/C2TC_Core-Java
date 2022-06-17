package string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2= new String("hello");
		String str3= new String("hello");
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		String s="hardik pandya";
		System.out.println(s.substring(7));
		System.out.println(s.substring(0,6));
		
		
	   /* String s6="java";
	    char ch=s6.charAt(2);
	    System.out.println(ch);
	    System.out.println(s6.charAt(4));
	    */
	/*	String s1="twilight saga";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch.i);
	*/
	
	/*	String str9="study";
		str9.concat("night");
		System.out.println(str9);
		
		StringBuffer str10=new StringBuffer("study");
		str10.append("night");
		System.out.println(str10);
	*/			
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append("java is my favourate language");
		System.out.println(sb.capacity());
		
	}
}


//equalsIgnoreCase
