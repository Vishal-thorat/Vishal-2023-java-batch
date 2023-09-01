package transient_modifier;

import java.io.Serializable;

public class Profile implements Serializable {
	
	String username;
 	transient String password;
    static String email;
}
