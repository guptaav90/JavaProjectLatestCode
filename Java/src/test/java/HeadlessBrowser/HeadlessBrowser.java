package HeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowser {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new HtmlUnitDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
	  
	  System.out.println(driver.getTitle());
	  
	  //driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	  boolean LogintoFacebook=driver.findElement(By.xpath("//span[contains(text(),'Log in to Facebook')]")).isDisplayed();
	  System.out.println(LogintoFacebook);
  }
}
