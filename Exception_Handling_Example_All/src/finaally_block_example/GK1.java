package finaally_block_example;

public class GK1 {
	public static void main(String[] args) {
       GK1 g =new GK1();
       g.printdata();
	}

	void printdata() {
		System.out.println("Start");
		for (int i=1;i<=50;i++){
			
			System.out.println(i);
			if(i==10) {
				break;
			}
		}
		System.out.println("end");
	return;    //method se bahar jata hai -- function break  --goes out of method
	}
}
