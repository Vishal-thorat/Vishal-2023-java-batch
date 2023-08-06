package file_Operation;

import java.io.File;
import java.io.IOException;

public class CheckGivenFileObjectRefType {
	
	static void ShowType(File f) {
		System.out.println("<<<<<<<<<<");
		
		System.out.println(f.isFile());   //true   false
		System.out.println(f.isDirectory()); //false  true
	}
	public static void main(String[] args)throws IOException {
		
		File f=new File("New_File.txt");
		if(!f.exists()) {
			f.createNewFile();
			
		}
		ShowType(f);  //true
		
		System.out.println(f.isFile());   //true   
		System.out.println(f.isDirectory()); //false 
		
		
		File f1=new File("My_Folder");
		f1.mkdir();
		ShowType(f1);  //true
	}

}
