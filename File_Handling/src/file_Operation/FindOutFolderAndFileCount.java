package file_Operation;

import java.io.File;

public class FindOutFolderAndFileCount {
	
	public static void main(String[] args) {
		
		// Assignemts print make folder and aslo in that folder make files and folder and print cour of file and folder
		int FileCount=0;
		int FolderCount=0;
		File file=new File("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\My_Folder"); //IDE gives double //
		
		String[] list =file.list();
		
		for(String str:list){
			//System.out.println(str);
		
			File f=new File("F:\\Vishal-2023-java\\Vishal-2023-java-batch\\File_Handling\\My_Folder\\"+str);   //,str;
			if(f.isFile()) {
				FileCount++;
				
					}else if(f.isDirectory() ) {
						
						FolderCount++;
						
					}
		}
		System.out.println("Total File count:"+FileCount);
		System.out.println("Total Folder Count:"+FolderCount);
	}

}
