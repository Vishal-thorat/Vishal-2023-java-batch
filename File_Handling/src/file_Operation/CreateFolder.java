package file_Operation;

import java.io.File;

public class CreateFolder {
	
	public static void main(String[] args) {
		
		File f=new File("My_Programs");
		f.mkdir();
	}

}
