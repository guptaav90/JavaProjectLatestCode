package QuitVSClose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class QuitVSClose {
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.irctc.co.in");
		
		 
		 Actions act=new Actions(driver);
		 act.clickAndHold(driver.findElement(By.xpath("//a[text()=' TRAINS ']"))).build().perform();
		  
		 act.moveToElement(driver.findElement(By.xpath("//span[text()='Cancel Ticket']"))).build().perform();
		 
		 act.moveToElement(driver.findElement(By.xpath("//span[text()='Counter Ticket']"))).build().perform();
		 
		 act.click(driver.findElement(By.xpath("//span[text()='Counter Ticket']"))).build().perform();
		 
		 //driver.close();
		 driver.quit();
		 
	  
  }
}
