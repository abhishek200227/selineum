package com.crm.DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pomfile.Register;

public class registerdetails {
@Test
	public void main() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
		Register res=new Register(driver);
		res.gender();
		res.first_name("hii");
		res.last_name("hello");
		res.email("hii@gmail.com");
		res.password("hii@2002");
		res.confirmpassword("hii@2002");
		res.register_button();
		

	}

}
