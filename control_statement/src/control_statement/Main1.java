package control_statement;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term=5;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
