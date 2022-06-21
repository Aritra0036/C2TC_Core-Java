package CollectionFramework;
import java.util.*;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mapinterface=new HashMap<>();
		mapinterface.put(100, "Rahul");
		mapinterface.put(98, "Ajay");
		mapinterface.put(88, "They work together in the same team");
		System.out.println(mapinterface);
		for(Map.Entry m:mapinterface.entrySet()){
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		Iterator <Integer> iteratorobj= mapinterface.keySet().iterator();
		while(iteratorobj.hasNext()) {
			Integer key=iteratorobj.next();
			System.out.println( key+" "+mapinterface.get(key));
		}

	}

}
//The insertion order is not preserved