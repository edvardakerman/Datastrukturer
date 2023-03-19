package myutil;

public class EmptyQueueException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 871972244440795555L;

	public EmptyQueueException() {
		super("Returvärdet är null.");
	}
}