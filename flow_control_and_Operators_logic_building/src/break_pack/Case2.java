package break_pack;

public class Case2 {
	public static void main(String[] args) {
		
		int []arr= {10,20,30,40,50,5,56,70,80,90};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==5) {
				System.out.println("Number is present");
				break;
			}
		}
	}
}
