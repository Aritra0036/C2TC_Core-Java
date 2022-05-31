
public class Staticblock {
	static {
		System.out.println("Hello");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Rishi");
      for(int i=1;i<=6;i++) {
    	  for(int j=6;j>=i;j--)
    	  {
    		  System.out.print("*");
    	  }
      System.out.println();
	}
	}
}
