package switch_case;

public class FinalReltedStuff {
	public static void main(String[] args) {

		char ch = 'M';

		final char c = 'M';

		switch (ch) {
		case 'B': {

		}
		case 'c': {

		}
		}

		// ----------------------
		final int x = 80;
		int a = 10;

		switch (a) {
		case 100: {

		}
		case 80 + x: { // expression should be compile tiime constant

		}
		}

		// ------------------------------
		float f = 90.00F;
		double d = 90.90;
//		switch(d) {   //byte short int char string and related wrapper classes
//		
//		}

		int m = 10;
		switch (m) {
		case 100: {

		}
		case 90: {

		}
		// case 100: { // Duplicate case not allow
		// }
		}
   int  b=10;    //128 to 127    ---can;t exceed range -- typecasting allow both 
		final byte b11 = 10;
		final byte b22 = 100;
		switch (b) {
		case b11: {

		}
		case b22: {

		}
		}

	}
}
