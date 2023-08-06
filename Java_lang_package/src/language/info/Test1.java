package language.info;

class AA{
	int x;
	int y;
	@Override
	public int hashCode() {
		return this.x+this.y;
		
	}
	@Override
	public String toString() {
		return "AA [x=" + x + ", y=" + y + "]";  //overriding tostring is good programming practise
	}
	
}



public class Test1 {
 public static void main(String[] args) {
	AA a=new AA();
	a.x=1;a.y=2;
	System.out.println(a);  //a.toString();
}
 
}
