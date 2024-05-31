package FailetestcaseScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class failescreenshot extends FilureScreenShotBaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime time=LocalDateTime.now();
		String date = time.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to=new File("./ScreenShot/ss"+date+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(from, to);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
