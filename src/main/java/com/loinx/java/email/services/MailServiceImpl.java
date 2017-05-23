/**
 * 
 */
package com.loinx.java.email.services;

import org.apache.commons.mail.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author loinx
 *
 */
public class MailServiceImpl implements MailService {
	private static final Logger LOGGER = LoggerFactory.getLogger(MailServiceImpl.class);

	public void sendEmail(Email mail) {
		LOGGER.info("Starting sending the email...");
		
		LOGGER.info("End sending the email...");
	}

}
