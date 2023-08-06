package pack.defaults.example;

public class ArrayDefaultValue {
	
	int[] arr1;
	String [] arr2;
	double [] arr3;
	
	static char[] arr4;
	static Student[] arr5;
	
	void m1() {
		int [] arr1 = new int [5];
		String [] arr2=new String [5];
		System.out.println(arr1[0]);//0
		System.out.println(arr2[4]);//null
			}
	
	

}
