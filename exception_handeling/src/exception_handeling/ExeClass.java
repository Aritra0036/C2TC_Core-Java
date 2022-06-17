package exception_handeling;

public class ExeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExeClass ob= new ExeClass();
		ob.display();
	}
		public void display(){
			try {
		System.out.println(100/0);
			}
			catch(ArithmeticException exc) {
				System.out.println("There occurs an exception :"+exc);
			}
			catch(Exception e) {
				System.out.println("There occurs an Arithmetic exception :"+e);
			}
	}
	//System.out.println("Outside The Body");

}
