package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.toolsqa.com/iframe-practice-page/");
	  
	  Thread.sleep(5000);
	  
	  ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
	  
	 
	  
	  //driver.switchTo().frame(0);//by index
	  //driver.switchTo().frame("iframe1");//by name
	  driver.switchTo().frame(driver.findElement(By.id("IF1")));//by webelement ID
	  driver.findElement(By.xpath("//a[@class='dt-mobile-menu-icon']")).click();
	  
	   driver.switchTo().defaultContent();
	   //driver.switchTo().parentFrame();
	  
	  
	  driver.findElement(By.xpath("//a[text()='Home']")).click();
	  
	 
	  
	  
	  
	  
  }
}
