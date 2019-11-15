package com.log4jtutorial;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Log4j {
	
	Logger logger=Logger.getLogger(Log4j.class);
	
	@Test
	public void log4j()
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("hai aditya");
		logger.info("hellow aditya");
	}

}