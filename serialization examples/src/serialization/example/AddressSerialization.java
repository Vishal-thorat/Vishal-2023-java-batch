package serialization.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AddressSerialization {

	public static void main(String[] args) throws Exception {
		
		Address adr =new Address("Santraj Height ", "kesanand wagholi", "Pune",99999);
		
		FileOutputStream file =new FileOutputStream("addressofvishal.txt");
		
		ObjectOutputStream obj=new ObjectOutputStream(file);
		
		obj.writeObject(adr);
		
		System.out.println("done");
	} 
}
