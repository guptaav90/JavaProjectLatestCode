package FindElementVsFindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementVsFindElements {
	
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.get("http://demo.guru99.com/test/upload/");
      
     WebElement FindElement= driver.findElement(By.name("send"));
     System.out.println(FindElement);
     boolean Displayed=FindElement.isDisplayed();
     System.out.println(Displayed);
     
     /*List<WebElement> FindElements=driver.findElements(By.tagName("a"));
     int FindElementsSize=FindElements.size();
     System.out.println(FindElementsSize);
     
     for (WebElement webElements : FindElements) {
		
    	 String WebElementsText=webElements.getText();
    	 System.out.println(WebElementsText);
	}
     */
     
     
  }
}
