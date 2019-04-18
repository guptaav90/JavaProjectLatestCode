package FileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
	
  @Test
  public void f() throws IOException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/upload/");
	  
	  driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Newfolder\\AviGupta\\Docx\\photograph-page-001.jpg");
	  driver.findElement(By.id("submitbutton")).click();
	  
	  driver.findElement(By.id("uploadfile_0")).click();

	  Runtime.getRuntime().exec("C:\\Users\\gupta.av\\Desktop\\AutoIT\\File Upload.exe");
	  driver.findElement(By.id("submitbutton")).click();
	  
	  
  }
}
