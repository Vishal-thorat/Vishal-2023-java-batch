package exception_handlingBasic.example;

public class PrintArray {
	
	public static void main(String[] args) {
		
		int [] arr= {10,20,30,40,50,60,70,80};
		
		//loop for ,do while,for,stream api
		System.out.println("I am start point");
		for (int i=-1;i<=arr.length;i++) {
//			try {
				System.out.println(arr[i]);      
//			}catch(Exception e) {
//				System.out.println("Exception occurs run this block");
//			}
			
		}                                                        
		System.out.println("I am end point");
	}

}
