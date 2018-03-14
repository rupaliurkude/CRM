package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'contacts')]")
	WebElement contactsLable;
	//Initializing PageObject
	
	public ContactsPage(){
		PageFactory.initElements(driver,this);
	}
	
	
	public boolean varifyContactsLable(){
		return contactsLable.isDisplayed();
	}
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']"
	+ "//parent::td[@class='datalistrow']//proceding-sibling::td[@class='datalistrow']"
	+ "//input[@name='contact_id']")).click();
		WebElement selectContacts;
	}


}
