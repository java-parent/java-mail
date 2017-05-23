/**
 * 
 */
package com.loinx.java.email;

/**
 * @author loinx
 *
 */
public class MailPreparationException extends Exception {

	private static final long serialVersionUID = 2775687782416630691L;

	public MailPreparationException() {
		super();
	}

	public MailPreparationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MailPreparationException(String message, Throwable cause) {
		super(message, cause);
	}

	public MailPreparationException(String message) {
		super(message);
	}

	public MailPreparationException(Throwable cause) {
		super(cause);
	}

}
