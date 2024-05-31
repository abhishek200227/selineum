package com.crm.DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pomfile.Welcome1;

public class wel {
@Test
	public void main() {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Welcome1 w1=new Welcome1(driver);
	w1.register();
	w1.login();
	w1.shoping();
	w1.wishlist();
	w1.searchfield("abhi");
	w1.search();
	w1.books();
	w1.computer();
	w1.electronics();
	w1.shoes();
	w1.digital();
	w1.jewelry();
	w1.giftcard();
	w1.facebook();
	w1.twitter();
	w1.rss();
	w1.youtube();
	w1.google();
   
	}

}
