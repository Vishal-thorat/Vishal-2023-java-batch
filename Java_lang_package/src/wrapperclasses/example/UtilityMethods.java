package wrapperclasses.example;

public class UtilityMethods {
	
	public static void main(String[] args) {
		//1] Valueof (static)
		
		Integer i=10;   //Integer i=Integer.valueof(int i)
	    Integer i1=Integer.valueOf(10);
	    Integer i2=Integer.valueOf("10");  //character class not contain this method
	    
	    //**********   Wrapper class Object Convert into Primitive 
	   
	    //2] xxxValue() instance method   e.g intValue()  ,   
	                                    
	    
	    int i4=i.intValue();
	    
	    Character ch=new Character('V');
	    char ch1=ch.charValue();
	    
	}

}
