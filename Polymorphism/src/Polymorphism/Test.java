package Polymorphism;
class bank{
	int getrateofinterest()
	     {
		    return 0;
	     }
    }
	class sbi extends bank{
		int getrateofinterest()
		 {
			return 8;
		 }
	}
	class icici extends bank{
			int getrateofinterest()
		 {
				return 7;
	     }
	}
	class axis extends bank{
			int getrateofinterest()
		 {
				return 9;
		 }
	}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi s=new sbi();
		icici i=new icici();
		axis a=new axis();
        System.out.println("sbi rate of interest :"+s.getrateofinterest());
        System.out.println("icici rate of interest :"+i.getrateofinterest());
        System.out.println("axis rate of interest :"+a.getrateofinterest());

	}

}
