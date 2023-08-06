package java.string.info.paack;

public class StringClassConstructor {
   
	
	public static void main(String[] args) {
		
		//zero args constructor 
		/*
		 * 1]
		  public String(){}
		  */
		String s1=new String();  
	/*
	 * 2]
	 * public String(String literal){}
	  
	 */
		
		String str1=new String("data");
		/*
		 * 3]
		 * Consider I have StringBuffer Object I want to Convert into String Object
		 * 
		 * public String(StringBuffer){}
		 */
		StringBuffer br=new StringBuffer("KGF CHAPTER-2");
		
		String str2=new String(br);
		
		
		char ch[]= {'v','i','s','h','a','l'};
		String str3=new String(ch);
		System.out.println(str3);
		
	}
}
