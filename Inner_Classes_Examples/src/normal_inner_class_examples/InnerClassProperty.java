package normal_inner_class_examples;

class Bank{
	Integer balance=100;
	
	class Account {
		Integer balance=1000;
		
		void m1() {
			Integer balance=10000;
			System.out.println(balance);
		    System.out.println(this.balance); 
		     System.out.println(Bank.this.balance);
		    
		    //	searching sequence --local(method madhe)--myown class--outer class
		}
	}
}



public class InnerClassProperty {
	public static void main(String[] args) {
		new Bank().new Account().m1();
	}

}
