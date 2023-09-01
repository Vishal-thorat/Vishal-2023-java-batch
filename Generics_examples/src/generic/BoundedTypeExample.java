package generic;

import java.util.ArrayList;

class Test<T extends Number>{
	T t;
	T getData(T t) {
		this.t=t;
		return this.t;  //multiplication addtition not allow becasue rruntime we are chnging data string etc
	}
}
public class BoundedTypeExample {

	public static void main(String[] args) {
		
//		ArrayList al=new ArrayList();
		      //integer and float are the child of that number 
		Test<Integer>t1=new Test();
		System.out.println(t1.getData(10));
		Test<Float>t2=new Test();
		System.out.println(t2.getData(10.10f));  //which data assign return that only 
		
	}
}
