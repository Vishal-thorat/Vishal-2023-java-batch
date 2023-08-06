package file_Operation;

import java.io.File;
import java.io.IOException;

public class methodsOfFileClass {
	
	public static void main(String[] args)throws IOException {
		
		File f=new File("Java_Notes.txt");  //here we create new file object f is pointing file "Java_Notes.txt" if exists //if not they not pointing 
		
		f.exists();  //return true or false
		f.createNewFile();
		/* RETURN TYPE is boolean 
		 * true :- if file is created
		 * if not then return false
		 */
		
		File f2=new File("My_Images");
		f.mkdir();
		//here new folder creation is done 
		//boolean :- true if folder is created , false if not created
		
	}

}
