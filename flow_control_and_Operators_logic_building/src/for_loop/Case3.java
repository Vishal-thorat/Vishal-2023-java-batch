package for_loop;

public class Case3 {
public static void main(String[] args) {
	
	int []arr1= {100,200,300,400,500};
	
	int i=0;
	for (;i<arr1.length;) {                  ///for (;true;) {   compiler gives true index Exceeded
		System.out.println(arr1[i]);
		i++;
	}
}
}
