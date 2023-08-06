package finaally_block_example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("1");
		try {
			int i=10/0;
			System.out.println("2");
			}
		catch(NumberFormatException e) {
			System.out.println("3");	
		}
		catch(ArithmeticException e) {
			System.out.println("**");
		}
		
		catch(Exception e) {
			System.out.println("##");
		}finally {
			System.out.println("4");
		}
		System.out.println("5");
	}                                    

}
