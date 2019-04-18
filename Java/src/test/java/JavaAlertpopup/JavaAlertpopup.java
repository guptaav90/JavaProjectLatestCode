package JavaAlertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaAlertpopup {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	  
	  
	  
	  driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
	  
	  Alert Simplealert=driver.switchTo().alert();
	  String AlertMsg=Simplealert.getText();
	  System.out.println("Simple Alert Text is : "+AlertMsg);
	  Simplealert.accept();
	  
	 
	  driver.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
	  
	  Alert ConfirmAlert=driver.switchTo().alert();
	  String ConfirmAlertMsg=ConfirmAlert.getText();
	  System.out.println("Confirm Alert Text is : "+ConfirmAlertMsg);
	  ConfirmAlert.dismiss();
	  
	  driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
	  
	  Alert PromptAlert=driver.switchTo().alert();
	  String PromptAlertMsg=PromptAlert.getText();
	  System.out.println("Prompt Alert Msg is : "+PromptAlertMsg);
	  PromptAlert.sendKeys("Accepting the alert");
	  PromptAlert.accept();
	  
	  
  }
}
