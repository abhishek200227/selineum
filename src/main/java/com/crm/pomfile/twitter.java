package com.crm.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class twitter {

	public twitter(WebDriver driver) {
   
		 PageFactory.initElements(driver,this);
	}
	
	private @FindBy(xpath="//a[text()='Twitter']")
	WebElement twi;
	
	private @FindBy(xpath="//span[text()='Create account']")
	WebElement create;
	
	private @FindBy(xpath="//span[text()='Name']")
	WebElement name;
	
	private @FindBy(xpath="//input[@name='phone_number']")
	WebElement phone;
	
	public void twi() {
		twi.click();
	}
	
	public void create() {
		create.click();
	}
	
	public void name(String value) {
		name.sendKeys(value);
	}
	
	public void phone(String value) {
		phone.sendKeys(value);
	}

}
