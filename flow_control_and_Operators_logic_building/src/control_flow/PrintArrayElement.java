package control_flow;

public class PrintArrayElement {
public static void main(String[] args) {
	
//	int i=0;
//	while(i<5) {
//		System.out.println(i);
//		i++;
	
//	}
	
	
	int []arr=new int [3];   //size =3  valid index 0-2
	arr[0]=100;
	arr[1]=200;
	arr[2]=300;
	
	int i=0;
	while(i<2) {
	System.out.println(arr[i]);
	i++;
	}
}
}
