package multiple.classses;

import java.util.Scanner;

public class Test1 {
	
	public	static final  String str =""; //final
	private String str1;
	String str2;
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		Test1 t1 =new Test1(str);
//		t1.str1="abc";
		
		int [] arr =new int[5];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Insert next element");
			arr[i]=sc.nextInt();
		}
	}
	
	//Test1(String str){
	//this.str=str;

}
//}

class B{
	public static void main(String[] args) {
		//Test1 t=new Test1("abc");
		
		//System.out.println(t.str);
		//t.str="lmn";
		
		//t.str1="abc"
	}
}