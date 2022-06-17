package static_method;

public class student {
	int rollno;
	String name;
	static String college="ITS" ;
	student(int r , String n){
		rollno=r;
		name=n;
	}
	void display() {
      System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1= new student(111,"Aritro");
		student s2= new student(222,"Arishu");
		s1.display();
		s2.display();

	}

}
