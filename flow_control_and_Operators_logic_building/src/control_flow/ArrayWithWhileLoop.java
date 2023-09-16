package control_flow;

public class ArrayWithWhileLoop {
	public static void main(String[] args) {

		int[] arr = new int[10]; // size=10; 10> 0 to 9
		System.out.println(arr.length);
		
		int i = 0; //init index
		int value=100;
		while (i < arr.length) {   //conditional expression
         arr[i]=value;
         value=value+100;
         i++;
		}

		
		PrintArray p=new PrintArray();
		p.printArrayElement(arr);
	}
}
