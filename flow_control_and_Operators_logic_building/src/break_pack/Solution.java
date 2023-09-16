package break_pack;

public class Solution {
public static void main(String[] args) {
	int []arr= {10,20,30,40,50,60,56,70,80,90};
	int targetElement=56;
	
	OperationOnArray  opt=new OperationOnArray();
	int result=opt.search(arr,targetElement);
	System.out.println(result);
}
}
