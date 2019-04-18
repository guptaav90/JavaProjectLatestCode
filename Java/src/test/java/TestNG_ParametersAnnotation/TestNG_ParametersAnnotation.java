package TestNG_ParametersAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_ParametersAnnotation {
	
	WebDriver driver;
	
  @Test
  @Parameters({"Browser","Url","Username","UsernameWebObj","PasswordWebObj","Password"})
  public void CRMPROLoginPageTest(String Browser,String Url,String Username,String UsernameWebObj,String PasswordWebObj,
		  String Password) throws InterruptedException {
	  
	  if (Browser.equalsIgnoreCase("Chrome"))
		  
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	  } 
	 else
	  {
		 System.setProperty("webdriver.gecko.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	  }
	 
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(Url);
	  
	  driver.findElement(By.name(UsernameWebObj)).sendKeys(Username);
	  driver.findElement(By.name(PasswordWebObj)).sendKeys(Password);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
  }
}
