package while_loop;


import if_else_statement.Printers;

public class Test2 {
public static void main(String[] args) {
	
	int []numArray1= {10,20,30,40,50,60};
	System.out.println("Before");
	Printers.print(numArray1);

	int i=0;
	while(i<numArray1.length) {
		numArray1[i]=numArray1[i]+10;
		i++;
	}
	System.out.println("after");
	Printers.print(numArray1);
	
}
}

