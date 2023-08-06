package method.Overriding.examples;





	class PK{
		void m1()  {
			
		}
		}
	class Child extends PK{
		@Override
		void m1() throws ArrayIndexOutOfBoundsException {
			int [] arr=new int[5];
			System.out.println(arr[10]);
		
	}
	}

	public class Unchecked {
		
		public static void main(String[] args)throws Exception {
			PK a =new PK();
			a.m1();
		}
	}



