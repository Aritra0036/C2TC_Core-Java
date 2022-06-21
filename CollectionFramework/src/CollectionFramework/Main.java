package CollectionFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<Integer>();
		list.add(null);
		list.add(1);
		list.add(2);
		list.add(11);
		list.add(11);
		list.add(100);
		list.add(200);
		list.remove(2);
		for(Integer i:list) {
			System.out.println(i);
		}
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j));
		}
		Iterator z=list.iterator();
		while(z.hasNext()) {
			System.out.println(z.next()+" ");
			
		}

	}

}
