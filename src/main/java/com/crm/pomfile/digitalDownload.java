package com.crm.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class digitalDownload {

	public digitalDownload(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	
    private @FindBy(xpath="//a[contains(text(),'Digital downloads')]")
	WebElement digital;
	
	private @FindBy(id="products-orderby")
	WebElement prod;
	
	private @FindBy(id="products-pagesize")
	WebElement sec;
	
	private @FindBy(id="products-viewmode")
	WebElement third;
	
	public void digital() {
		digital.click();
	}
	
	

}
