package exception_handeling;

import java.util.*;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=0;
		try
		{
		   int z=x/y;
		}
		catch(Exception e) 
		{
		   System.out.println(e);
		}
		
		System.out.println("first line");
		System.out.println("second line");
		int[] myintarray=new int[] {1,2,3,4};
		print(myintarray);
		System.out.println("third line");
	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("fourth element successfully displayed");
	}

}
