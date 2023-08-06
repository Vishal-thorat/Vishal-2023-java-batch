package file_Operation;

import java.io.File;

public class DeleteFileMethods {
	public static void main(String[] args) {
		
		File f=new File("New_File.txt");
		
		if(f.exists()) {
			f.delete();
		}
	}

}
