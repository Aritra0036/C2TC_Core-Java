
public class Student {
	String rollno;
	String name;
	float fee;
	static String college="HKBK";
	Student(String r,String n,float f){
		rollno = r;
		name=n;
		fee=f;
		}
	static void change() {
		college="IEM";
	}
	void display() {
		System.out.println(rollno + " " + name + " " + fee + " " + college );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =new Student("111","karan",5000f);
		Student s2= new Student("112","karthik",6000f);
		Student s3= new Student("12k","ari",4900f);
		change();
		s1.display();
		s2.display();
		s3.display();
		

	}

}
