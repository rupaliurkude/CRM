package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	//PageFactory -Object repo
	@FindBy(name="username")
	WebElement username;

	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath ="//input[@type ='button']")
	WebElement signUpBtn;
	
	@FindBy(xpath ="img[contains[(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initial the Page Object
	public LoginPage(){
		PageFactory.initElements( driver, this);
		
	}
	//Actions
	public String validLoginPageTitel(){
		return driver.getTitle();
	
	}
	public boolean validCrmImage(){
		return crmLogo.isDisplayed();

	}
	public HomePage Login(String usr,String pass){
		username.sendKeys(usr);
		password.sendKeys(pass);
		loginBtn.click();
		
		return new HomePage();
		
	}

}