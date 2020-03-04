package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	
	public ReadConfig() {
		File source = new File("./configration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(source);
			pro = new Properties();
			pro.load(fis);
			
			System.out.println("Propertis file is :"+fis);
			
		}catch(Exception e) {
			System.out.println("The exception is :"+e.getMessage());
			
		}
		
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}


	public String getChromePath() {
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}

}
