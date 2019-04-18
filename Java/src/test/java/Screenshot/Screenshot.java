package Screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Screenshot {
	
	WebDriver driver;
	@BeforeMethod
	public void Test() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
  @Test
  public void f(String TakeScrShot) throws Throwable  {
	  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.facebook.com");
	  
	  File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File(".//Screenshot//"+TakeScrShot+".png"));
	
  }
}
