package com.crm.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart1 {

	public addtocart1(WebDriver driver) {

		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Digital downloads')]")
	WebElement digital;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	WebElement addtocart;
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
	WebElement pic2;
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[3]")
		WebElement pic3;
	
	public void digital() {
		digital.click();
	}
	
	public void addtocart1() {
		
		addtocart.click();
	}
	
	public void pic2() {
		pic2.click();
	}
	
	public void pic3() {
		pic3.click();
	}

}
