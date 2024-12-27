package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UseFileNotException {

	public static void main(String[] args) throws IOException {
		
		//File f = new File();
		FileReader fr = new FileReader("C://Users//user//Desktop//raj.txt.txt");
		
		int temp = 0;
		while((temp=fr.read())!=-1) {
			
			System.out.print((char) temp);
		}
//		int one = 10;
//		char a = (char) one;
//		System.out.println(a);
	}

}
