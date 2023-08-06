package exception_handlingBasic.example;

public class Test {
	public static void main(String[] args) {
		System.out.println("I am start point");
		Integer []arr= {10,20,30,40,50,60,70,80};  //(0-7)=8
		
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
		
		try{                                 //Risky code
		System.out.println(arr[6]); 
		
		System.out.println(arr[2]);  //abnormal termination
		System.out.println(arr[10]); 
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(arr[4]);
		System.out.println("I am End point");
	}

}
