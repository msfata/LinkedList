package net.set;

/*
 * author MSFATA ProgrammingHelp
 */

public class ImmutableExample {
	/*
	 * instance variable
	 */
	private final String message;

	/*
	 * constructor
	 */
	public ImmutableExample(String message) {
		this.message = message;
	}

	/*
	 * getters method
	 */
	public String getMessage() {
		return this.message;
	}
}
