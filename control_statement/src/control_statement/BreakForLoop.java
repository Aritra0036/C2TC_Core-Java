package control_statement;

public class BreakForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("before breaking ="+i);
			if(i==6)
				break;
			System.out.println("after breaking="+i);
		}
		System.out.println("for loop terminated");
	}

}
