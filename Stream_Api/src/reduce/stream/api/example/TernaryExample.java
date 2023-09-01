package reduce.stream.api.example;

public class TernaryExample {
public static void main(String[] args) {
	
	int a=10;int b=20;
	int max;
	
	if(a>b) {
		max=a;
	}else {
		max=b;	
	}
	System.out.println(max);
	
	//using ternary operator
	
	int m=10;int n=200;
	
	int res=m>n?m:n;
	System.out.println(res);
	
	
}
}
