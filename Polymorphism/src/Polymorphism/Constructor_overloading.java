package Polymorphism;

class Student1{
	int id;
	String name;
	int age;


   Student1(int i,String n){
	id=i;
	name=n;
}
   Student1(int i,String n,int a){
	id=i;
	name=n;
	age=a;
}
   void display() {
		System.out.println(id+" "+name+" "+age);
	}

public class Constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(111,"Aritro");
		Student1 s2=new Student1(222,"Arishu",25);
		s1.display();
		s2.display();

	   }
	}

}
