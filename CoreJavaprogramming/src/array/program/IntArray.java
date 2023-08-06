package array.program;

public class IntArray {
	public static void main(String[] args) {
		
		int [] a =new int [5];
		System.out.println(a.length);  //length 5
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
