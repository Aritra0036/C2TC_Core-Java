
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] arr= {12,4,5,2,5};
	//	for(int i=0;i<arr.length;i++) {
	//		System.out.println(arr[i]+" ");
	//	}
		
		
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the size of the array:");
	    int size=sc.nextInt();
	    int[] arr = new int[size];
	    
	    System.out.println("Enter "+ arr.length + " integer values:");

	    for(int i=0; i < arr.length; i++) {
	      arr[i] = sc.nextInt();
	    } 
        System.out.println("Array elements are:");
	    for (int i=0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }
	    System.out.println("the smalller number is");
	    
	    
    }
}
