package CollectionFramework;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> names=new LinkedList<>();
		names.add("Mahi");
		names.add("Ari");
		names.add("Sohom");
		names.add("Raj");
		names.add("Shan");
		names.add("Rishi");
		names.add(null);
		names.addFirst("Anshu");
		names.addLast("Sanket");
		System.out.println("The names in the list are    " +names);

	}

}
