package com.crm.DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pomfile.addtocart1;

public class add {
@Test
	public void main() throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	addtocart1 a1=new addtocart1(driver);
	a1.digital();
	a1.addtocart1();
	Thread.sleep(2000);
	a1.pic2();
	Thread.sleep(2000);
	a1.pic3();
	
	
	}

}
