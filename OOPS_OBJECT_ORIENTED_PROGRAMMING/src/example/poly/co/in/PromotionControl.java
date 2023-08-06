package example.poly.co.in;

public class PromotionControl {
	
	public static void main(String[] args) {
		

	AutomaticPromotion a =new AutomaticPromotion();
//	short b=10;
//	a.m1('b');
	
	//a.m1(10, 10.0f);
	//a.m1(10, 10);  //dependancy and ambiguity problem
	
	
//	byte b=10;
//	short s=69;
//	a.m1( b, s);
	
	float b=10;
	short s=69;
	a.m1( b, s);
}
} 
