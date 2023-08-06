package string_class_methods;

public class StringClassMethods {
	
	public static void main(String[] args) {
		
		String str="Right way learning pvt ltd";
		
		String []arr= {"abc","pqr","lmn"};
		System.out.println(str.length()); //String class have Length()method 
		System.out.println(arr.length);  //array class have length property
		
		//--------------------------------------------------------------------------------
		
		String str1="Right way learning pvt ltd";
		String []arr1= {"abc","pqr","lmn"};
		char ch =str1.charAt(6);
		System.out.println(ch);
		
		String s=arr1[2];
		System.out.println(s);
		
		String str9=new String("hello");
		String str10="hello";
		boolean b=str9.equals(str10);
		System.out.println(b);           //True
		System.out.println(str9==str10); //false
		
		System.out.println("<<<<<<<<<<<<<");
		
		String s3="rightway";
		String s4="RIGHTWAY";
		
		System.out.println(s3.equals(s4));  //false
		System.out.println(s3.equalsIgnoreCase(s4)); //True
		
		 String str5=new String("data");
		 String str6="data";
		 System.out.println(str5.hashCode()==str6.hashCode());  //True
		System.out.println(str5==str6);                          //false
		
		System.out.println("<<<<<<<<<<<<<<<<<");
		
	//Substring   //6 is starting point sttart then copt and then paste
		
		String st="Hi hello Good Morning India"  ;  //0-26  >>27
		String st1=st.substring(6);   //lo  Good Morning India                  
	    String st3=st.substring(22);//India
	    System.out.println(st1);
	    System.out.println(st3);
	    
	    //System.out.println(st3.substring(29));  //StringIndexOutOfBoundsException:
	    
	    String st11=st.substring(9,13);
	    System.out.println(st11);
	
	}

}
