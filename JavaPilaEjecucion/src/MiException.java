
public class MiException extends RuntimeException { //Is an unchecked exception
	
	public MiException() { //Constructor that calls the mother class
		super();
	}
	
	public MiException(String message) { // Contructor to write a message on the exception
		super(message);
	}
}
