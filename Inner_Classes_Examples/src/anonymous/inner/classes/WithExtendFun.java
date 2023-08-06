package anonymous.inner.classes;

class Popcorn{
	public void test() {
		System.out.println("spicy");
	}
}
//class SaltyPopcorn extends Popcorn{  //extend and override
//	@Override
//	public void test() {
//		System.out.println("salty");
//	}
//}

public class WithExtendFun {
 public static void main(String[] args) {
	 Popcorn p=new Popcorn();
	 p.test();
//	 
//	 Popcorn p1=new SaltyPopcorn();
//	 p1.test();
	 
	 
	 Popcorn p1=new Popcorn() {
		 @Override
		public void test() {
			System.out.println("salty");
		}
	 };
	 p1.test();
}
}
