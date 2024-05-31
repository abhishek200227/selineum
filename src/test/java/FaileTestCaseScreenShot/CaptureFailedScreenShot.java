package FaileTestCaseScreenShot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.pomfile.Login1;

import FailetestcaseScreenshot.BaseClass;

public class CaptureFailedScreenShot extends BaseClass {
	@Test
	public void dwsLoginCorrect() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Login1 dws=new Login1(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@Test
	public void dwsLoginWrong() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Login1 dws=new Login1(driver);
		dws.username("admin02@gmail.com");
		dws.password("admin02");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@Test
	public void redbus() {
		driver.get("https://www.redbus.in/");
		assertEquals("abhi", "abh");
	}

}
