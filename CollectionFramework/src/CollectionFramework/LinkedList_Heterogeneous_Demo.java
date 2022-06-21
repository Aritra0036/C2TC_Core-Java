package CollectionFramework;

import java.util.*;

public class LinkedList_Heterogeneous_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list= new LinkedList();
		list.add("Raj");
		list.add(4);
        list.add("Rishav");
        list.add(8);
        list.add(56.8f);
        list.add(null);
        list.add(6);
        System.out.println(((LinkedList)list).offer("Arishu"));
        System.out.println("The initial linkedlist is "+list);
		
	}

}
