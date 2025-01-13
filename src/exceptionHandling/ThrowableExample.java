package exceptionHandling;

public class ThrowableExample {

	public static void main(String[] args) {
		
	        try {
	            int result = 10 / 0; // This will cause ArithmeticException
	        } catch (Throwable e) { // Catch any throwable object
	            System.out.println("Caught throwable: " + e.getMessage());
	            System.out.println("Throwable class: " + e.getClass().getName());
	            e.printStackTrace(); // Prints the stack trace
	        }
	}

}
