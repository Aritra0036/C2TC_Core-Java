package CollectionFramework;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,String> mapobj= new HashMap<>();
		mapobj.put("first","professor");
		mapobj.put("second","berlin");
		mapobj.put("Third","tokyo");
		mapobj.put("Fourth","nairobi");
		mapobj.put("Fourth","nairobi");
		mapobj.put("Fifth","nairobi");//keys are  unique values duplicated
		
		System.out.println(mapobj);//insertion order is not preserved
		System.out.println(mapobj.get("Third"));//used the retrieve the value
		System.out.println(mapobj.get("tokyo"));//no key called tokyo "null"
		System.out.println(mapobj.get("Fourth"));
		System.out.println(mapobj.get("Fifth"));
		

	}

}
//keys should be unique
