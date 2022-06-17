package static_method;

public class student2 {
	int rollno;
	String name;
	static String college ;
	static {
		college="IEM";
	}
	student2(int r , String n){
		rollno=r;
		name=n;
	}
	static void change() {
		college="RV";
	}
	void display() {
      System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student2 s1= new student2(111,"Aritro");
		student2 s2= new student2(222,"Arishu");
		s1.display();
		s2.display();

	}

}
