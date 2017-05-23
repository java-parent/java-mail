package com.loinx.java.email.templates.freemaker;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.loinx.java.email.TemplateParserException;
import com.loinx.java.email.templates.TemplateParser;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;
import freemarker.template.Version;

/**
 * 
 * @author loinx
 *
 */
public class FreeMakerTemplateParser implements TemplateParser {
	private static final Logger LOGGER = LoggerFactory.getLogger(FreeMakerTemplateParser.class);

	private final String CONFIG_FILE_NAME = "freemarker";

	private static final Version DEFAULT_VERSION = Configuration.VERSION_2_3_23;

	private Configuration configuration;

	public FreeMakerTemplateParser() {
		this((Configuration) null);
	}

	public FreeMakerTemplateParser(Configuration configuration) {
		if (Objects.nonNull(configuration)) {
			this.configuration = configuration;
		} else {
			setDefaultConfiguration();
		}
	}

	public Object parseTemplate(String templatePath, Map<String, Object> templateData) throws TemplateParserException {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Starting to parse the template {} ", templatePath);
		}
		// this.configuration.getTemplate(name)
		try {
			Template template = configuration.getTemplate(templatePath);
//			template.process(templateData, out);

		} catch (IOException e) {
		}
		return null;
	}

	public void setDefaultConfiguration() {
		try {
			this.configuration = new Configuration(DEFAULT_VERSION);
			ResourceBundle bundle = ResourceBundle.getBundle(CONFIG_FILE_NAME);
			configuration.setSettings(convertResourceBundleToProperties(bundle));
		} catch (Exception e) {
			LOGGER.error("Unable to configure for Free Maker.");
			throw new TemplateParserException("Unable to configure for Free Maker.", e);
		}
	}

	static Properties convertResourceBundleToProperties(ResourceBundle resource) {
		Properties properties = new Properties();

		Enumeration<String> keys = resource.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			properties.put(key, resource.getString(key));
		}

		return properties;
	}
}
