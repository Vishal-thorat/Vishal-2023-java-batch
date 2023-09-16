package switch_case;

public class ColorSelection {
	
 public ColorSelection() {}
 
	String selectColor(char ch) {
		String color;
		switch(ch) {
		case 'w':{
			color="white";
			break;
		}
		case 'G':{
			color="green";
			break;
			
		}
		case 'Y':{
			color="YELLOW";
		}
		case 'R':{
			color="RED";
			break;
		}
		case 'B':{
			color="BLUE";
			break;
		}
		default:{
			color= "No Match found";
		}
		
		}return color;
	}
}
