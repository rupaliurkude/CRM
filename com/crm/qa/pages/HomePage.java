package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//td[contain(text(),User:'rupali urkude'])")
		WebElement userNameLabel;
	
	@FindBy(xpath="//a[@title='Contacts']")
		WebElement contactsLink;
	
	@FindBy(xpath="//a[@title='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[@title='Tasks']")
	WebElement taskLink;

	//Initialising the HomePage Object
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
		public String validHomePageTitel(){
			return driver.getTitle();
	}
		public boolean varifyCorrectUserName(){
			return userNameLabel.isDisplayed();
			
		}
	
	public ContactsPage clickOnContactsLinks(){
		contactsLink.click();
		return new ContactsPage ();
	}
	public DealsPage clickOnDealsLinks(){
		dealsLink.click();
		return new DealsPage ();
	
	}

	public TasksPage clickOnTaskLinks(){
		taskLink.click();
		return new TasksPage();

	}

	

}



