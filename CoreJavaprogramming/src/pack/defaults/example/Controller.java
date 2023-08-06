package pack.defaults.example;

public class Controller {
	
	public static void main(String[] args) {
		ArrayDefaultValue a =new ArrayDefaultValue();
		
		a.arr1 =new int [5];
		System.out.println(a.arr1[0]);  //0
		
		a.arr2 =new String [5];
		System.out.println(a.arr2[0]); //null
		
		a.arr3=new double[2];
		System.out.println(a.arr3[0]);  //0.0
		
		ArrayDefaultValue.arr4=new char[5];
		ArrayDefaultValue.arr5=new Student[5];
		
		System.out.println(ArrayDefaultValue.arr4[0]);//empty space 
		System.out.println(ArrayDefaultValue.arr5[0]);//null
		System.out.println("<<<<<<<<<<<<<<<<<<<<");

		a.m1();
		
		
		
		
		
	}

}
