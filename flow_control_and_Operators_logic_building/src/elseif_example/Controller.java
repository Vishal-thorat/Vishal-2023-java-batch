package elseif_example;

public class Controller {
public static void main(String[] args) {
	Consultant c=new Consultant();
	ClassRoom obj=c.advice(20);
	Printer.print(obj);
}
}
