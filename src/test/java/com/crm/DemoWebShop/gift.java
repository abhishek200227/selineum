package com.crm.DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.pomfile.giftcard;
@Listeners(com.crm.Listenersclass.ListernerImplements.class)
public class gift {
@Test
	public void main() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	giftcard gif=new giftcard(driver);
	gif.gift_cart();
	gif.click_on();
	gif.recipient_name("heloo");
	gif.recipient_email("hello@gmail.com");
	gif.name("abhi");
	gif.email("abhi@gmail.com");
	gif.message("hiii");
	gif.addtocart();
	

	}

}
