package super_and_this;
class PP{
	PP(){
		System.out.println("Parent zero arg constructor ");
	}
	PP(int a){
		System.out.println("Parent one args constuctor");
	}
}
class CC extends PP{
	CC(){
		super (10);
		System.out.println("child zero args constuctor ");
	}
	CC (int a){
		super();
		System.out.println("child one args constuctor ");
	}
}




public class MultiConstructionDemo {
  public static void main(String[] args) {
	CC c=new CC();
	CC c1=new CC(20);
}
}
