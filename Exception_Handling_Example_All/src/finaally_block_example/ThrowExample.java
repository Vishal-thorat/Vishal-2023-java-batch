package finaally_block_example;

import java.io.File;
import java.io.IOException;

public class ThrowExample {
	public static void main(String[] args)throws Exception {
		
		//int i=10/0;  // Arithmatic Exception unchecked Exception
		
		//checked Exception

//		File f=new File("abc.txt"); 
//		try {
//			f.createNewFile();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		//bypass  --not intrested to write try and catch
		File f=new File("abc.txt");
		try {
		f.createNewFile();
		}catch(Exception e) {
			
		}
	}

}
