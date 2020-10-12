package com.banco.clientes.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties loadProperty(String url) {
		
		Properties properties = new Properties();
		InputStream input = PropertiesUtil.class.getClassLoader().getResourceAsStream(url);
		try {
			properties.load(input);
			return properties;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
