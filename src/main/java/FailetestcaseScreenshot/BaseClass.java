package FailetestcaseScreenshot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public static WebDriver driver;
	 
	     
	     @BeforeClass
	     public void beforeclass() {
	    	 driver = new ChromeDriver();
	    	 driver.manage().window().maximize();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
	    	driver.close();
	     }
	     
	   
}
