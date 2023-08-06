package file_Operation;

import java.io.File;

public class ListOutNamesOfFileAndFolder {
	public static void main(String[] args) {
		
		File f=new File("My_Folder");
		
		if(f.exists() && f.isDirectory()) {
			String[] names=f.list();
			System.out.println(names.length);  //
			
			for(String name:names) {
				System.out.println(name);
			}
		}
	}
// Assignemts print make folder and aslo in that folder make files and folder and print cour of file and folder
}
 