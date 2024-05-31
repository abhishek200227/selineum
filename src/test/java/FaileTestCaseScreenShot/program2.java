package FaileTestCaseScreenShot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pomfile.Login1;

import FailetestcaseScreenshot.FilureScreenShotBaseClass;

public class program2 extends FilureScreenShotBaseClass{
@Test
	public void correctDetails() {
		
		//driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Login1 l1=new Login1(driver);
		
		l1.username("admin01@gmail.com");
		l1.password("admin01");
		l1.checkbox();
		l1.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		

	}
	@Test
     public void wrongDetails() {
		
		//driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Login1 l1=new Login1(driver);
		l1.username("admin01@gmail.com");
		l1.password("admin02");
		l1.checkbox();
		l1.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		

	}
     @Test
     public void redbus() {
    	 //driver=new ChromeDriver();
    	 driver.get("https://www.redbus.in/");
    	 assertEquals("hii", "hi");
     }

}
