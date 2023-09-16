package for_loop;

import java.util.Iterator;

public class Case4 {

	public static void main(String[] args) {
		String []arr= {"ABC","B","C","D"};
		for (int i = 0; i < arr.length;i =i+2) {       // i-(int)i+2;
			System.out.println(arr[i]);
		}
	}
}
