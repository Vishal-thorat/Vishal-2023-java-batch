package my.custom.exception;


public class InvalidAgeException extends RuntimeException {

	
	public InvalidAgeException() {
		super();
	}
	public  InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}
