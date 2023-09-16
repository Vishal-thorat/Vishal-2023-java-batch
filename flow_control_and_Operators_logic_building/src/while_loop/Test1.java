package while_loop;

public class Test1 {
   public static void main(String[] args) {
	
	   int num=1;
		while(num<=10) {
			if(num%2==1) {
				num++;
			}
			System.out.println(num);
			num++;
		}
		System.out.println(">>>>>"+num);
}
}
