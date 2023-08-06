package method.Overriding.examples;

class SouthGate{
	synchronized	void keyEntryPoint() {                              //synchronized //strictfp//native --can be override 
		System.out.println("this is South india key entry point");
	}
}
class NorthGate extends SouthGate{
	 void keyEntryPoint() {                                         //final cant overide      //static  is not part of object--data hiding --ex of compile time polymorphism
		System.out.println("this is North india key entry point");    //private cant override 
	}
}
public class EntryPoint {
	public static void main(String[] args) {
		SouthGate s=new NorthGate();
		s.keyEntryPoint();
	}

}



//abstract void keyEntryPoint();                             
//	void m1() {
//		
//	}