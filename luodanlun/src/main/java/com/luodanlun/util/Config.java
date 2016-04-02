package com.luodanlun.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class Config {

	private static Properties properties = new Properties();

	static {
		try {
			properties.load(new InputStreamReader(Thread.currentThread()
					.getContextClassLoader()
					.getResourceAsStream("config.properties"), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key){
		return properties.getProperty(key);
	}
	
	public static void updateProperties(String key, String value){
		properties.setProperty(key, value);
	}
	
	public static void main(String[] args) {
		System.out.println(getValue("user"));
		System.out.println("install -Dmaven.test.skip");
	}
}
