package com.crm.DemoWebShop;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.pomfile.twitter;
@Listeners(com.crm.Listenersclass.ListernerImplements.class)
public class twitterlogin extends baseclass{
@Test
	public void main() throws InterruptedException {
		 
	  Actions act=new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(2000);
	  twitter twi=new twitter(driver);
	  Thread.sleep(2000);
	  twi.twi();
	  Set<String> window = driver.getWindowHandles();
	  int i=0;
	  for(String s1:window)
	  {
		  if(i>0)
		  {
			  driver.switchTo().window(s1);
			  Thread.sleep(2000);
			  twi.create();
			  twi.name("hello");
			  twi.phone("1234567890");
		  }
	  }
	  

	}

}
