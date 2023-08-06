package file_Operation;

import java.io.File;
import java.io.IOException;

public class GoodWayToCreateFile {
	public static void main(String[] args)throws IOException {
		
		File f=new File("Resume.doc");
		//if resume.doc file is exists then point to that file if not then ignore
		//check file is available or not
		if (!f.exists()){
			f.createNewFile();
		}
	}

}
