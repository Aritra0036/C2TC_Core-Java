package CollectionFramework;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class MainScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nm= new Scanner(System.in);
		String s1=nm.next();
		String s2=nm.next();
		String s3=nm.next();
		String s4=nm.next();
		
		Set<String> sc = new HashSet<>();
		
		sc.add(s1);
		sc.add(s2);
		sc.add(s3);
		sc.add(s4);
		System.out.println(sc);
		System.out.println(sc.size());
		for(String s : sc) {
			System.out.println(s);
		}
		
		

	}

}
