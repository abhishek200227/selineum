package com.crm.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	public  Register(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	private @FindBy(xpath="//a[text()='Register']")
	WebElement regi;
	
	private @FindBy(id="gender-male")
	WebElement gender;
	
	private @FindBy(id="FirstName")
	WebElement first_name;
	
	private @FindBy(id="LastName")
	WebElement last_name;
	
	private @FindBy(id="Email")
	WebElement email;
	
	private @FindBy(id="Password")
	WebElement password;
	
	private @FindBy(id="ConfirmPassword")
	WebElement confirmpassword;
	
	private @FindBy(id="register-button")
	WebElement register_button;
	
	
	public void regi() {
		regi.click();
	}
	
  public void gender() {
	  gender.click();
  }
  
  public void first_name(String value) {
	  first_name.sendKeys(value);
  }
  
  public void last_name(String value) {
	  last_name.sendKeys(value);
  }
  
  public void email(String value) {
	  email.sendKeys(value);
  }
  
  public void password(String value) {
	  password.sendKeys(value);
  }
  
 public void confirmpassword(String value) {
	 confirmpassword.sendKeys(value);
 }
 
 public void register_button() {
	 register_button.click();
 }

}
