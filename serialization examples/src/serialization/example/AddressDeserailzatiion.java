package serialization.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AddressDeserailzatiion {
	public static void main(String[] args) throws Exception{
		
		FileInputStream file=new FileInputStream("addressofvishal.txt");
		ObjectInputStream obj=new ObjectInputStream(file);
		Address adr=(Address)obj.readObject();
		
		System.out.println(adr);
		
	}

}
