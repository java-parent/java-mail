/**
 * 
 */
package com.loinx.java.email;

/**
 * The exception to present the error occurs during parsing template.
 * 
 * @author loinx
 *
 */
public class TemplateParserException extends RuntimeException {

	private static final long serialVersionUID = 6481519051451425456L;

	public TemplateParserException() {
		super();
	}

	public TemplateParserException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TemplateParserException(String message, Throwable cause) {
		super(message, cause);
	}

	public TemplateParserException(String message) {
		super(message);
	}

	public TemplateParserException(Throwable cause) {
		super(cause);
	}

}
