package ImplicitVsExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitVsExplicitWait {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);
	  driver.get("http://softwaretestingexcellence.blogspot.com/2015/04/difference-between-implicit-wait-and_22.html");
	
	  
	WebDriverWait wait=new WebDriverWait(driver, 5);
	 /* 
	  WebElement webelement=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Sign in']"))));
	  boolean displayed= webelement.isDisplayed();
	  System.out.println(displayed);
	  */
	  
	  
	  
	  
	  
  }
}
