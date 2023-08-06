package anonymous.inner.classes;

interface Fun{
	void doFun();
}

//class FunImpl implements Fun{
//	@Override
//	public void doFun() {
//		System.out.println("Spend time with your Friends");
//		
//	}
//}

public class WithImplFun {
public static void main(String[] args) {
	
//	Fun f=new FunImpl();
//	f.doFun();
	
	
	Fun f=new Fun() {
		@Override
		public void doFun() {
			System.out.println("Spend time with your Friends");
			
		}
	};
	f.doFun();
	
	
}
}
