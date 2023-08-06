package array.program;

public class ShowUp {

	void print(String[]arr) {
		
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		ShowUp s =new ShowUp();
		
		String[] names=new String[3];
		names[0]="vishal";
		names[1]="Saurabh";
		names[2]="Shubham";
		s.print(names);
	}
	
	
	
	
	
}
