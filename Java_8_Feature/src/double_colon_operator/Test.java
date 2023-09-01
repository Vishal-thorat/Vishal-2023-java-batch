package double_colon_operator;
@FunctionalInterface
interface MyLogic{
	public void show(Integer e);
}

//Method or constructor reference opt  >> ::
public class Test {
public static void main(String[] args) {
	

//	MyLogic m=(e)->{
//		for(int i=0;i<=e;i=i+2) {
//			System.out.println(i);
//		}
//	};
	
	MyLogic m= new MyOwnLogic() ::m1;//static that why object came
	m.show(10);
	
	
	
//	Runnable r=()->{
	
//};
	
	
	Runnable r=MyOwnLogic :: myOwnRunMethod;
	
	Thread t=new Thread(r);
	t.start();
	
	
	
}
}