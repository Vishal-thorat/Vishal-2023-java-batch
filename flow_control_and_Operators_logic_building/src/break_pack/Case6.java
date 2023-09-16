package break_pack;

public class Case6 {
public static void main(String[] args) {
	int []arr= {10,20,30,40,50,60,56,70,80,90};
	
	for (int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.println("inside if"+arr[i]);
			continue;
		}
			int s=arr[i]*arr[i];
		System.out.println("yes , i done m job"+s);
	}
}
}
