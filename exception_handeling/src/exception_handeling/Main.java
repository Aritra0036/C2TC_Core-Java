package exception_handeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		fis =new FileInputStream("G:\\myfile.txt");
		int k;
		while((k=fis.read())!= -1) {
			System.out.print((char)k);
		}
		fis.close();

	}

}
