package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.crmpro.com/register/");
	  
	  
	  
	  Select select= new Select(driver.findElement(By.id("payment_plan_id")));
	  
	  WebElement GetFirstSelectedOption= select.getFirstSelectedOption();
	 // System.out.println(GetFirstSelectedOption);
	  String DropdownDefaultValue=GetFirstSelectedOption.getText();
	  System.out.println("DefaultDropdownValue is : "+DropdownDefaultValue);
	  
	  List<WebElement> GetOptions=select.getOptions();
	  int SizeOFdropdownValue =GetOptions.size();
	  System.out.println("SizeOFDropdownValue is : " +SizeOFdropdownValue);
	  
	  for (WebElement webElement : GetOptions) {
		
		  String DropdownValue =webElement.getText();
		  System.out.println("DropdownValue Are : " +DropdownValue);
	}
	  
	  
	  select.selectByIndex(2);
	  
	  Thread.sleep(2000);
	  
	  select.selectByValue("1");
	  
	  Thread.sleep(2000);
	  
	  select.selectByVisibleText("CRMPRO - $29.95 user/mo.");
	  
	 
	  
  }
}
