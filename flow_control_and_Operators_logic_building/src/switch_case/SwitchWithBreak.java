package switch_case;

public class SwitchWithBreak {
	public static void main(String[] args) {

		int arg = 1;
		switch (arg) {
		case 0: {
			System.out.println("0");
			break;
		}                                            //condition match break
		case 1: {
			System.out.println("1");
			break;
		}
		case 2: {
			System.out.println("2");
			break;
		}
		default: {
			System.out.println("defaut");
			break;
		}

		}
	}
}
