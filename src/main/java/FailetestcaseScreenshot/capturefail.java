package FailetestcaseScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class capturefail extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime date=LocalDateTime.now();
		String time=date.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File to=new File("./ScreenShot/dws"+time+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(from, to);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
