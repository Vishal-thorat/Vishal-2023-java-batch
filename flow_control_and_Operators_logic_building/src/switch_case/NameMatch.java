
package switch_case;

public class NameMatch {

	public static void main(String[] args) {
		
		String name="Vishal";
		switch(name) {
		case "Samantha":{
			System.out.println("She is southern indian actreess samanth prabhu");   //gives break beacasue lock is open ---locking concept happen
		   break;
		}
		case "Nayatara":{
			System.out.println("She is western indian actreess nayan prabhu");
			break;
		}
		
		case "Vishal":{
			System.out.println("She is northern indian actreess  prabhu");
			break;
		}
		case "Shradha":{
			System.out.println("She is eastern indian actreess samanth prabhu");
			break;
		}
		default:{
			System.out.println("No match found");
		}
		}
	}
}
