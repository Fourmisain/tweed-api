package de.siphalor.tweed.config.constraints;

public class ConstraintException extends Exception {
	public boolean fatal;

	/**
	 * Constructs a new exception.
	 * @param message The message which is going to be displayed to the user.
	 * @param fatal Sets whether the entry should be treated as invalid. (If you've fixed the incorrect value you may want to set this to false)
	 */
	public ConstraintException(String message, boolean fatal) {
		super(message);
		this.fatal = fatal;
	}
}
