package com.crm.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome1 {

	public Welcome1(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	
	private @FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	private @FindBy(xpath="//a[text()='Log in']")
	WebElement login;
	
	private @FindBy(xpath="//a[text()='Shopping cart']")
	WebElement shoping;
	
	private @FindBy(xpath="//a[text()='Wishlist']")
	WebElement wishlist;
	
	private @FindBy(id="small-searchterms")
	WebElement searchfield;
	
	private @FindBy(xpath="//input[@type='submit']")
	WebElement search;
	
	private @FindBy(xpath="//a[contains(text(),'Books')]")
	WebElement books;
	
	private @FindBy(xpath="//a[contains(text(),'Computers')]")
	WebElement computer;
	
	private @FindBy(xpath="//a[contains(text(),'Electronics')]")
	WebElement electronics;
	
	private @FindBy(xpath="//a[contains(text(),'Apparel & Shoes')]")
	WebElement shoes;
	
	private @FindBy(xpath="//a[contains(text(),'Digital downloads')]")
	WebElement digital;
	
	private @FindBy(xpath="//a[contains(text(),'Jewelry')]")
	WebElement jewelry;
	
	private @FindBy(xpath="//a[contains(text(),'Gift Cards')]")
    WebElement giftcard;
	
	private @FindBy(xpath="//a[text()='Facebook']")
	WebElement facebook;
	
	private @FindBy(xpath="//a[text()='Twitter']")
	WebElement twitter;
	
	private @FindBy(xpath="//a[text()='RSS']")
	WebElement rss;
	
	private @FindBy(xpath="//a[text()='YouTube']")
	WebElement youtube;
	
	private @FindBy(xpath="//a[text()='Google+']")
	WebElement google;
	
	public void register() {
		register.click();
	}
	
	public void login() {
		login.click();
	}
	
	public void shoping() {
		shoping.click();
	}
	
	public void wishlist() {
		wishlist.click();
	}
	
	public void searchfield(String value) {
		searchfield.sendKeys(value);
	}
	
	public void search() {
		search.click();
	}
	
	public void books() {
		books.click();
	}
	
	public void computer() {
		computer.click();
	}
	
	public void electronics() {
		electronics.click();
	}
	
	public void shoes() {
		shoes.click();
	}
	
	public void digital() {
		digital.click();
	}
	
	public void jewelry() {
		jewelry.click();
	}
	
	public void giftcard() {
		giftcard.click();
	}
	
	public void facebook() {
		facebook.click();
	}
	
	public void twitter() {
		twitter.click();
	}
	
	public void rss() {
		rss.click();
	}
	
	public void youtube() {
		youtube.click();
	}
	
	public void google() {
		google.click();
	}
	
	
	

}
