package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://www.irctc.co.in/nget/");
	  
	  String ParentWindow=driver.getWindowHandle();
	  System.out.println(ParentWindow);
	  
	  Actions act=new Actions(driver);
	  act.clickAndHold(driver.findElement(By.xpath("//a[contains(text(),' HOLIDAYS ')]"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Packages')]"))).build().perform();
	  act.click(driver.findElement(By.xpath("//span[contains(text(),'Tour Packages')]"))).build().perform();
	  
	  Set<String> WindowsHandling=driver.getWindowHandles();
	  System.out.println(WindowsHandling.size());
	  System.out.println(WindowsHandling);
	  
	  for (String RailwaysTourism : WindowsHandling) {
		  
		  if (!ParentWindow.equalsIgnoreCase(RailwaysTourism)) {
			  
			  driver.switchTo().window(RailwaysTourism);
			  String TitleOfRailwaystourism=driver.getTitle();
			  System.out.println(TitleOfRailwaystourism);
			  driver.findElement(By.xpath("//a[@class='brand-logo']//img[@class='hide-on-med-and-down logo']")).click();
			  driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
			
			
		}
		
		  
	}
	  
	
	  Set<String>OtherWindowHandling=driver.getWindowHandles();
	  System.out.println(OtherWindowHandling.size());
	  System.out.println(OtherWindowHandling);
	  /* 
	  for (String AirTicketBooking : OtherWindowHandling) {
		  
	  if (!ParentWindow.equalsIgnoreCase(AirTicketBooking)) {
		  
		  driver.switchTo().window(AirTicketBooking);
		  String TitleOfRailwaystourism=driver.getTitle();
		  System.out.println(TitleOfRailwaystourism);
		 
		
	}
	
	  
}
	  */
	  
	  
	  
	  for (String AirTicketBooking : OtherWindowHandling) {
		  
		  driver.switchTo().window(AirTicketBooking);
		  Thread.sleep(2000);
		  if (driver.getTitle().contentEquals("Air Ticket")) {
			
		} {
			  
			  System.out.println(driver.getTitle());
			
		}
		
	}
	  
	  driver.switchTo().window(ParentWindow);
	  driver.findElement(By.xpath("//a[contains(text(),' LOGIN ')]")).click();
	  
	  
	  
	  
	  
  }
}
