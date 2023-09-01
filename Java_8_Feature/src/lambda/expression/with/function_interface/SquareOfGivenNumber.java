package lambda.expression.with.function_interface;

interface Square{
	Integer square(Integer a);
}

class FindOutSquare implements Square{

	@Override
	public Integer square(Integer a) {
		int s=a*a;
		return s;
		
	}
	
}
public class SquareOfGivenNumber {
   public static void main(String[] args) {
	   Square s=new FindOutSquare();
	   Integer sq=s.square(10);
	   System.out.println(sq);
	   
	   
	   
	   //lamda expression
	   
	   Square s1=(Integer a)->{return a*a;};
	   Square s2= a->a*a;
	   System.out.println(s2.square(25));
}
}
