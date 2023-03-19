package myutil;

public class EmptyStackException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6456162004966899670L;

	public EmptyStackException() {
		super("Returvärdet är null.");
	}
}
