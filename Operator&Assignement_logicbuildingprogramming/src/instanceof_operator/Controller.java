package instanceof_operator;


public class Controller {
public static void main(String[] args) {
	
	String str="hello";
	MathsOpt maths=new MathsOpt();
	//----------------------------------------------- Object obj =new ????????? Object type variable can hold any type
	User u=new User();
	u.caller(str);
	u.caller(maths);
	
	
}
}
