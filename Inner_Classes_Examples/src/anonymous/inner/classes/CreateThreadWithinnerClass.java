package anonymous.inner.classes;

//class MyThread extends Thread{
//	@Override
//	public void run() {
//		for (int i=1;i<=1000;i++) {
//			System.out.println("child="+i);
//		}
//	}
//}
//
//
//public class CreateThreadWithinnerClass {
//public static void main(String[] args) {
//	MyThread m=new MyThread();
//	m.start();
//	
//	for (int i=1;i<=1000;i++) {
//		System.out.println("parent="+i);
//	}
//}
	
	
	
	
	

		


public class CreateThreadWithinnerClass {

	public static void main(String[] args) {
		Thread m=new Thread() {
		@Override

		public void run() {
			for (int i=1;i<=1000;i++) {
				System.out.println("child="+i);
			}
		}
	};
		m.start();
		
		for (int i=1;i<=1000;i++) {
			System.out.println("parent="+i);
		}
	}
}
