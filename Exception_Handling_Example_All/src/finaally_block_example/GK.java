package finaally_block_example;

public class GK {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60,70,80};
		int num=4000;
		
		GK g=new GK();
	    g.printNumber(arr, num);
		
	}
	void printNumber(int[]arr,int num) {
		boolean isNumberPresent=false;
		for (int i=0;i<arr.length;i++) {
			System.out.println("?????????");
			if(num == arr[i]) {
				isNumberPresent=true;
				break;                    //break the loop  for loop ,do while loop,foreach
			}
		}
		if(isNumberPresent) {
			System.out.println("Present");
		}
		else {
			System.out.println("absent");
		}
	}
}
