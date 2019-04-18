package Execute_Failed_TestCases_Using_IRetryAnalyzer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases {
	WebDriver driver;
	
	@Test(priority=0)
	  public void GooglePageTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://google.co.in");
		  
		  String GooglePageTitle=driver.getTitle();
		  System.out.println(GooglePageTitle);
		  Assert.assertEquals(GooglePageTitle, "Googl");
		  
	  }
	  
	  @Test(priority=1)
	  public void GmailPageTest() {
		  
		  driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		  
		  String GmailPageTest=driver.getTitle();
		  System.out.println(GmailPageTest);
		  Assert.assertEquals(GmailPageTest, "Sign in - Google ");
		  
		  
		  
		  
		  
	  }
	  
	  @Test(priority=2)
	  public void LearnMoreTest() {
		  
		  driver.findElement(By.xpath("//a[text()='Learn more']")).click();
		  
		  String LearnMoreTest=driver.getTitle();
		  System.out.println(LearnMoreTest);
		  Assert.assertEquals(LearnMoreTest, "Browse Chrome as a guest - Computer - Google Chrome");
		  
		  
		  
		  
		  
	  }
}
