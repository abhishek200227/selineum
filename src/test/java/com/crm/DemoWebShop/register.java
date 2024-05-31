package com.crm.DemoWebShop;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.pomfile.Register;
@Listeners(com.crm.Listenersclass.ListernerImplements.class)
public class register extends baseclass{
@Test
	public void main() {
	String Actual_title = "Demo Web Shop. Register";
	Register reg=new Register(driver);
	reg.regi();
	String title = driver.getTitle();
	System.out.println(title);
	if(Actual_title .equals(title))
	{
		System.out.println("you are current web page");
		reg.gender();
		reg.first_name("hello");
		reg.last_name("hii");
		reg.email("hello@gmail.com");
		reg.password("hello@2002");
		reg.confirmpassword("hello@2002");
		reg.register_button();
	}
	else
	{
		System.out.println("yor are in wrong web page");
	}
		

	}

}
