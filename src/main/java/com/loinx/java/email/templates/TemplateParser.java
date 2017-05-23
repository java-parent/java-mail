/**
 * 
 */
package com.loinx.java.email.templates;

import java.util.Map;

import com.loinx.java.email.TemplateParserException;

/**
 * @author loinx
 *
 */
public interface TemplateParser {
	public Object parseTemplate(String templatePath, Map<String, Object> templateData) throws TemplateParserException;
}
