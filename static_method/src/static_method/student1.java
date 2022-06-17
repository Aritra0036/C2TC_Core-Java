package static_method;

public class student1 {
	String rollno;
	String name;
	float fee;
	static String college="IEM";
	student1(String r,String n,float f){
		rollno = r;
		name=n;
		fee=f;
		}
	static void change() {
	college="HKBK";
	}
	void display() {
		System.out.println(rollno + " " + name + " " + fee + " " + college );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1 =new student1("111","karan",5000f);
		student1 s2= new student1("112","karthik",6000f);
		student1 s3= new student1("12k","ari",4900f);
		change();
		s1.display();
		s2.display();
		s3.display();
		

	}

}