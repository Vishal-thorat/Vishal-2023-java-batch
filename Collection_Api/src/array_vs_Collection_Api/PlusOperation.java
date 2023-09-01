package array_vs_Collection_Api;

public class PlusOperation<R> {

//	Integer add(Integer a,Integer  b) {
//		return a+b;
//	}
	
	
	R add(R a){
		return a;
	}
}


class MyStorage<T,R>{
	T a;
	R b;
	
	void printInfo() {
		System.out.println(a);
		System.out.println(b);
	}
}