package language.info;

class BB{
	private Integer a;
	private Integer b;
	
	public BB(Integer a,Integer b) {       //model ready
		this.a=a;
		this.b=b;
	}
	BB(){}
	
	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "BB [a=" + a + ", b=" + b + "]";
	}

}

public class HashcodeDemo {
 public static void main(String[] args) {
	 BB b=new BB(5,2);                          //5,2
	 System.out.println(b);  //null ,null
	 System.out.println(b.hashCode());  //405662939
}

}
