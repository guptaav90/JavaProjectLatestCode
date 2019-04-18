package ScrollUpDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollUpDown {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Actions act=new Actions(driver);
	  act.sendKeys(Keys.ENTER).build().perform();
	  Thread.sleep(2000);
	  ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	  Thread.sleep(2000);
	  WebElement Text=  driver.findElement(By.xpath("//a[text()='Sign in']"));
	 
	  
	  String TextOfElement=Text.getText();//28.How to get text of web element    
	  System.out.println(TextOfElement);
	  driver.findElement(By.name("q")).clear();//27.How to input the text in selenium and how to clear the text in selenium?
	  WebElement Attribute=driver.findElement(By.xpath("//a[text()='Sign in']"));
	  String AttributeText=Attribute.getAttribute("class");//29.How to get attribute value of web element
	  System.out.println(AttributeText);
	  driver.navigate().to("https://www.softwaretestingmaterial.com/how-to-locate-element-by-link-text-and-partial-link-text-locator/");
	  driver.findElement(By.linkText("locators in Selenium")).click();//30.How to click on hyperlink in selenium? 
	  String CurrentUrl=driver.getCurrentUrl();
	  System.out.println(CurrentUrl);
	  
	  driver.navigate().to("http://demo.guru99.com/test/upload/");
	  
	  List<WebElement> List=driver.findElements(By.xpath("//input"));
	  int ListSize=List.size();
	  System.out.println(ListSize);
	  
	  for (WebElement webElement : List) {
		
		  String Listwebelement=webElement.getTagName();
		  System.out.println(Listwebelement);
	}
	  
	  
	  

	  
  }
}
