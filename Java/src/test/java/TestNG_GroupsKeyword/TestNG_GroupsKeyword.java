package TestNG_GroupsKeyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_GroupsKeyword {
  
	WebDriver driver;
	
	 @Test(groups="LoginPageGroup",priority=-1)
	  public void CRMPROLoginPageTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.crmpro.com");
		  
		  driver.findElement(By.name("username")).sendKeys("guptaav90");
		  driver.findElement(By.name("password")).sendKeys("cspl@2020");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();

	  }
	  
	  @Test(groups="LoginPageGroup",priority=0)
	  public void SwitchToIframe() throws InterruptedException {
		  
		  driver.switchTo().frame("mainpanel");

	  }
	  
	  @Test(groups="HomePageGroup",priority=1)
	  public void CRMPROHomePageTest() throws InterruptedException {
		  
		 WebElement User= driver.findElement(By.xpath("//tr//td[contains(text(),'User: Avi Gupta')]"));
		 String UserText=User.getText();
		 System.out.println("UserNameValidation :" +UserText);
		 Assert.assertEquals(UserText, "  User: Avi Gupta");

	  }
	  
	 
	  
	  @Test(groups="HomePageGroup",priority=2)
	  public void CRMPROTaskTest() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Tasks')]")).click();

	  }
}
