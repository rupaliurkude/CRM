package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.util.TestUtil;

import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;
import org.openqa.selenium.WebDriver;

public class TestBase {
public	static WebDriver driver; 
public	static Properties prop;
	
	public TestBase(){
		try{
		prop= new  Properties ();
		FileInputStream ip = new FileInputStream("/Users/rupaliurkude/Documents/workspace/FreeCrmTest/src/main/java/com/crm/qa/cofig/cofig.properties"+
		"qa/config/config.properties");
		prop.load(ip);
		
		}catch(FileFormatException e ){
			e.printStackTrace();
		}
			catch (IOException e){
				e.printStackTrace();
			}
				
	  }		
	public static void initialising(){
    	
		String browserName  = prop.getProperty("browser");
			if (browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","/Users/rupaliurkude/Downloads/chromedriver");
			 driver = new ChromeDriver();
			}else if (browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver","/Users/rupaliurkude/Downloads/geckodriver");
				driver = new FirefoxDriver();		
			}
			driver.manage().window();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS );
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
	}
	

}


