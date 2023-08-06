package file_Operation;

import java.io.File;   //imported when we type file then enter
import java.io.IOException;

public class CreateFileAndFolder {
	
	public static void main(String[] args)throws IOException {
		
		File f=new File("sample.pdf");
		boolean b=f.exists();
		
	//	System.out.println(b);  //false
		f.createNewFile();
		System.out.println(f.exists()); //true
	}

}
