package language.info;

class QAEngg{
	int a;
	int b;
	QAEngg(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public int hashCode() {   //hashcode method overiride
	
		return a+b;
	}
//	@Override
//	public String toString() {
//		return "hi hello";-
//	}
}

public class SoftwareDeveloper {
public static void main(String[] args) {
	QAEngg q=new QAEngg(1,2);
	System.out.println(q);  //q.toString >>object   ---Fully qualified name of class @ before and after is that the hashcode(HexaDecimal)
	System.out.println(q.toString());  
	
	System.out.println("<<<<<<<<<<<<<<<<");
	System.out.println(q.getClass().getName());
	System.out.println(Integer.toHexString(q.hashCode()));
}
}
