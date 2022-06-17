package this_keyword;

class student{
	int rollno;
	String name;
	float fee;
   
     student(int rollno,String name,float fee)
       {
	     this.rollno=rollno;
	     this.name=name;
	     this.fee=fee;
       }
     void display() 
       {
    	 System.out.println(rollno+" "+name+" "+fee);
       }
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(111,"Aritro",50000f);
		student s2=new student(222,"Arishu",60000f);
		student s3=new student(333,"Anshu",45000f);
		s1.display();
		s2.display();
		s3.display();

	}

}
