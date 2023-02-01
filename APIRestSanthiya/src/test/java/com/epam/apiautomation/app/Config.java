package com.epam.apiautomation.app;

import java.io.InputStream;
import java.util.Properties;

public class Config {

	public String baseuri;
	static Properties prop = new Properties();
	
	public Config() {
		try{
			InputStream file=Config.class.getClassLoader().getResourceAsStream("config.properties");
			prop.load(file);
			baseuri = prop.getProperty("baseuri");
		}
		catch(Exception e) {
			e.printStackTrace();
		}}
}
