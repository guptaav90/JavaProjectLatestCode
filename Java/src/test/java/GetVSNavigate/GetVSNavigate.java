package GetVSNavigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class GetVSNavigate {
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	  
	  Thread.sleep(5000);
	  driver.navigate().to("http://testingpool.com");
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  driver.navigate().forward();
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(2, 5);
	 
	  
	  //To get the current Url
	  String GetCurrentUrl=driver.getCurrentUrl();
	  System.out.println(GetCurrentUrl);
	  sa.assertAll();
  }
  
}
