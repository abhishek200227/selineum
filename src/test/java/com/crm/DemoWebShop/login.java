package com.crm.DemoWebShop;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.pomfile.Login1;

@Listeners(com.crm.Listenersclass.ListernerImplements.class)

public class login {
@Test(dataProvider = "login")
	public void main(String username,String password) {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	Login1 lng=new Login1(driver);
	lng.username(username);
	lng.password(password);
	lng.checkbox();
	lng.login_button();
	
	}

@DataProvider(name="login")
public Object[][] sender() throws EncryptedDocumentException, IOException{
	return loginDataProvider.dwsLogin();
}

	


}
