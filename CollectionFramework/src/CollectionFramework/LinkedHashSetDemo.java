package CollectionFramework;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet linked=new LinkedHashSet();
		linked.add("rahul");
		linked.add("A");
		linked.add("Rohan");
		linked.add(8);
		linked.add(90.2f);
		linked.add(null);
		linked.add(8);
		System.out.println("The data in the set "+ linked);
		System.out.println(linked.size());
	}

}
