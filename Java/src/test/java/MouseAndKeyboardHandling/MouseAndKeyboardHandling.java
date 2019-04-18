package MouseAndKeyboardHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAndKeyboardHandling {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.irctc.co.in");
	 //WebDriverManager.chromedriver().setup();
	 
	 Actions act=new Actions(driver);
	 act.clickAndHold(driver.findElement(By.xpath("//a[text()=' TRAINS ']"))).build().perform();
	  
	 act.moveToElement(driver.findElement(By.xpath("//span[text()='Cancel Ticket']"))).build().perform();
	 
	 act.moveToElement(driver.findElement(By.xpath("//span[text()='Counter Ticket']"))).build().perform();
	 
	 act.click(driver.findElement(By.xpath("//span[text()='Counter Ticket']"))).build().perform();
	 
	 driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/");
	 
	 Thread.sleep(2000);
	 
	 ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
	 
	 
	 act.doubleClick(driver.findElement(By.xpath("//div[@id='treebox1']//span[contains(text(),'Books')]"))).build().perform();
	 
	// act.contextClick().build().perform();
	 
	 driver.navigate().to("http://jqueryui.com/droppable/");
	 
	 //Thread.sleep(2000);

	/* WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	 WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	 act.dragAndDrop(drag, drop).build().perform();
	 */
	 
			
	 driver.navigate().to("http://www.facebook.com");
	
	 
	 act.sendKeys(driver.findElement(By.name("email")),"avigupta");
	 Thread.sleep(2000);
	 act.sendKeys(driver.findElement(By.name("email")),Keys.TAB).build().perform();
	 Thread.sleep(2000);
	 act.sendKeys(driver.findElement(By.name("pass")), Keys.SPACE).build().perform();
	 Thread.sleep(2000);
	 act.sendKeys(driver.findElement(By.name("pass")), Keys.BACK_SPACE).build().perform();
	 Thread.sleep(2000);
	 act.sendKeys(driver.findElement(By.name("pass")),Keys.TAB).build().perform();
	 Thread.sleep(2000);
	 act.sendKeys(driver.findElement(By.xpath("//input[@name='firstname']")),Keys.NUMPAD1).build().perform();
	  
	 
	 
	
	  
  }
}
