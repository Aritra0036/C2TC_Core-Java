package exception_handeling;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("G:\\myfile.txt");
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("the specified file is not"+"present at the given path");
		}
		int k;
		try {
			while((k=fis.read())!= -1) {
				System.out.print((char)k);
			}
			fis.close();
		}catch(IOException ioe) {
			System.out.println("I/O error occurred:"+ioe);
		}

	}

}
