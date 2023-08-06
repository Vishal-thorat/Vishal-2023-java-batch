package exception_handlingBasic.example;

public class Case1 {
	
	public static void main(String[] args) {
		
//		int[]arr= {10,20,30};
		int []arr=null;
		try {
		System.out.println(arr[5]);
			//System.out.println(arr.length);
			
		}catch(ArrayIndexOutOfBoundsException e) {              //child  and then parent flow  
			System.out.println("I am child");
		}
		catch(Exception e) {
			System.out.println("I am parent");
		}
	}

}
