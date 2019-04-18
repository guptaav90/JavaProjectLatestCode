package Taking_ScreenShot_ONLY_for_Failed_Tests_in_Selenium_using_TestNG_Listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotBase {
	
	static WebDriver driver;
	
	
	public void failure(String TestMethodName) {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(".//TakeScreenShot//"+TestMethodName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
