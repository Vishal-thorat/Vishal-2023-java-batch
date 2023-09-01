package lambda.expression.with.function_interface;

interface Graph{
	void findCircleArea(int radius);
	
	default Double PIvalue() {
		return 3.14;
	}
}

class GraphImpl implements Graph{
	@Override
	public void findCircleArea(int r) {
		System.out.println(PIvalue() *r*r);
		
	}
}


class GraphImpl2 implements Graph{
	@Override
	public void findCircleArea(int r) {
		System.out.println(PIvalue() *r*r); // System.out.println((22.0/7.0) *r*r);
		
	}
}
public class DefaultMethodDemo {
 public static void main(String[] args) {
	
	 new GraphImpl().findCircleArea(7);
	 new GraphImpl2().findCircleArea(7);
}
}
