package abstract_classand_interface;

public class ControlRestraurant {

	public static void main(String[] args) {
		 
		MenuCard m=new MenuCardImpl();
		
		Customer c=new Customer();
		c.order(m);
	}
}
