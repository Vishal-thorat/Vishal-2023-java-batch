package method.Overriding.examples;

class AA{
	 void m1() {
		System.out.println("I am AA class m1");   //static method you cant override as a non static --use both site it work
	}
}
class BB extends AA{
	//@Override  void m1(int a) 
	  void m1() {           //final       //native an be overrride //strictfp  as you wish ride or not//synchronised 
		System.out.println("I am BB class m1");  //method hiding 
	}
	
}
public class StaticMethodOverridingExample {
	
	public static void main(String[] args) {
		
		AA a=new BB();
		a.m1();
	}
	
	
	

}
