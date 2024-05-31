package com.crm.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class giftcard {

	public giftcard(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	private @FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	WebElement gift_cart;
	
	private @FindBy(xpath="//a[text()='$5 Virtual Gift Card']")
	WebElement click_on;
	
	private @FindBy(id="giftcard_1_RecipientName")
	WebElement recipient_name;
	
	private @FindBy(id="giftcard_1_RecipientEmail")
	WebElement recipient_email;
	
	private @FindBy(id="giftcard_1_SenderName")
	WebElement name;
	
	private @FindBy(id="giftcard_1_SenderEmail")
	WebElement email;
	
	private @FindBy(id="giftcard_1_Message")
	WebElement message;
	
	private @FindBy(id="add-to-cart-button-1")
	WebElement addtocart;
	
	
	public void gift_cart() {
		gift_cart.click();
	}
	
	public void click_on() {
		click_on.click();
	}
	
	public void recipient_name(String value) {
		recipient_name.sendKeys(value);
	}
	
	public void recipient_email(String value) {
		recipient_email.sendKeys(value);
	}
	
	public void name(String value) {
		name.sendKeys(value);
	}
	
	public void email(String value) {
		email.sendKeys(value);
	}
	public void message(String value) {
		message.sendKeys(value);
	}
	
	public void addtocart() {
		addtocart.click();
	}
}
