package string.logic.building.programs;


class Examples{
	public Integer countStringLength(String str) {
	 char []arr =str.toCharArray();
	 int cnt=0;
	 for(int i=0;i<arr.length;i++) {
		 cnt++;
	 }
	 return cnt;
}


}






public class StringExample {
public static void main(String[] args) {
	Examples e=new Examples();
	System.out.println(e.countStringLength("Vishalthorat"));
	
	
	byte b[]= {97,98,99};
	String str4=new String(b);
	System.out.println(str4);
}
}
