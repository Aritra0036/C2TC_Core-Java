package CollectionFramework;
import java.util.*;
public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet <String> sites=new TreeSet<>();
		sites.add("Technical");
		sites.add("Technology");
		sites.add("quiz");
		sites.add("code");
		System.out.println("Sorted Set "+sites);
		System.out.println("First "+sites.first());
		System.out.println("Last "+sites.last());

	}

}
