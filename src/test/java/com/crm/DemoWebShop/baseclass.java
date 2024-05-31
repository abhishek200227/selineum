package com.crm.DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseclass {
        WebDriver driver;
	@BeforeSuite
	public  void beforesuite() {
		System.out.println("before suite");
     }
     
     @BeforeTest
     public void beforetest() {
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	 driver.get("https://demowebshop.tricentis.com/");
     }
     
     @BeforeClass
     public void beforeclass() {
    	System.out.print("before class");
     }
     
     @BeforeMethod
     public void beforemethod() {
    	 System.out.println("before method");
     }
     
     
     @AfterMethod
     
     public void aftermethod()
     {
    	 System.out.println("after method");
     }
     
     @AfterClass
     
     public void afterclass()
     {
    	System.out.println("after class"); 
     }
    
    @AfterTest
     
     public void aftertest() {
    	 System.out.println("after test");
     }
    @AfterSuite
     
     public void aftersuite()
     {
    	 System.out.print("after suite");
     }

    
     
}
