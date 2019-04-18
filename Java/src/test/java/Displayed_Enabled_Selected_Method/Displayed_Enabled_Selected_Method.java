package Displayed_Enabled_Selected_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Displayed_Enabled_Selected_Method {
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.crmpro.com/register/");
	  
	boolean Displayed=  driver.findElement(By.name("first_name")).isDisplayed();
	System.out.println(Displayed);
	
	boolean Enabled=driver.findElement(By.name("submitButton")).isEnabled();
	System.out.println(Enabled);
	
	boolean Selected=driver.findElement(By.name("agreeTerms")).isSelected();
	System.out.println(Selected);
	
	driver.findElement(By.name("agreeTerms")).click();
	
	boolean Enabled1=driver.findElement(By.name("submitButton")).isEnabled();
	System.out.println(Enabled1);
	
	boolean Selected1=driver.findElement(By.name("agreeTerms")).isSelected();
	System.out.println(Selected1);
	  
	  
  }
}
