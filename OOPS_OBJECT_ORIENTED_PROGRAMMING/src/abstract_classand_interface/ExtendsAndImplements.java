package abstract_classand_interface;
//case1
class A{}
class B{}
class C extends A{}  //it will not work 
//case2 

abstract class AB{
	abstract void m1();
	
}
class BC extends AB{
	void m1() {
		
	}
}

//case 3

class CC{
	void m1() {
		
	}
}
abstract class DD extends CC{
	@Override
	void m1() {
		
	}
	abstract void m2() ;
	//////////////////////////////////-----------------------
	//case4
	interface S1{
		void m1();
		void m2();
		
	}
//	Cannot reduce the visibility of the inherited method 
//	 from DD.S1
//	- implements abstract_classand_interface.DD.S1.m2
	class Mh implements S1{               
		public void m1() {}
		public void m2() {}
	}
}

//case5

interface KK{
	void m1();
	
}
interface LL{
	void m2();
}

class PP implements KK,LL{
	public void m1() {}
	public void m2() {}
}

//case 6
interface YY{
	void m1();
	
}
interface XX{
	void m1();        //OVERRIDE  Q.1 JAVA SUPPORT MULTIPLE INHERITANCEE --YES --USING INTERFACE --USING CLASSS NO
}

class OO implements YY,XX{          ///CLASSS TO CLASS,,,CLASS TO AC CLASS   ,,,AC CLASS TO CLASS
	//AC CLASS TO AC CLASS   //INTERFACE TO CLASS //AC to interface combi
	public void m1() {}
	
}


////AC CLASS TO AC CLASS 
abstract class UU{
	abstract void m1();
	
}
abstract class ff extends UU{
	abstract void m1();
}
class II extends ff{
	 void m1() {}
}



//ac to interface 

interface SS{
	void m2();
	
}

abstract class VV implements SS{
	abstract void m5() ;	
}
class NN extends VV{
	public void m2() {}
	void m5() {}
}


//interface to interface 

interface GG{
	void m1();
}
interface KK1 extends GG{
	void m2();
	
}
class TT implements KK1{
	public void m1() {
		
	}
public void m2() {
		
	}
}

public class ExtendsAndImplements {

}
