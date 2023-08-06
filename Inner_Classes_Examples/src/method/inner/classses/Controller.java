package method.inner.classses;

import java.util.Map;

public class Controller {
	public static void main(String[] args) {
		
		MathsOperation m=new MathsOperation();
		Map<Integer,Integer> result=m.getSquareList(1, 10);
		System.out.println(result);
		
	}

}
