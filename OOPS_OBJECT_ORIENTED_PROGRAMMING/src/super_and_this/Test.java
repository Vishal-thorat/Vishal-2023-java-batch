package super_and_this;

class PA{
	public PA(String msg) {
		System.out.println(msg);
	}
}

class CA extends PA{
	 Integer i; 
	 Integer j;
	public CA(String msg, Integer i, Integer j) {
		super(msg);
		this.i = i;
		this.j = j;
	}
}


 public class Test {
 
 public static void main(String[] args) {
	CA c=new CA("data",10,20);
}
}
