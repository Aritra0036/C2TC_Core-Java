package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String> linked=new LinkedHashSet<>();
		linked.add("Rahul");
		linked.add("pass");
		linked.add("blood");
		linked.add("A+");
		System.out.println(linked);
		linked.toArray();
		Object[] a=linked.toArray();
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
