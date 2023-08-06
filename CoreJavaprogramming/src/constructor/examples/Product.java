package constructor.examples;

public class Product {
	
	int ProductId;
	String productName;
	
	Product(){
		System.out.println("good");
	}
	
	void Product() {
		System.out.println("Hi Hello");   //Bad Programming practise
	}
	
	public static void main(String[] args) {
		Product p=new Product();
		p.Product();
	}

}
