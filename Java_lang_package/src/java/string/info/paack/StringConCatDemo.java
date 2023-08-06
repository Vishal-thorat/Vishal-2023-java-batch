package java.string.info.paack;

public class StringConCatDemo {
public static void main(String[] args) {
	
	String s1="abc";
	String s2=s1+"pqr";
	String s3="abcpqr";
	
	
	System.out.println(s2==s3); //false
	System.out.println(s2=s3);  //true
	System.out.println(s2.hashCode()==s3.hashCode());  //true
	
	System.out.println(s1.hashCode()==s3.hashCode());  //false
}
}
