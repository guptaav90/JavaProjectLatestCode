package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class XpathFunction {
	
	
	@Test
	public void xpath() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.crmpro.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		/*
		//Relative Xapth
		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
		*/
		//Contains
		driver.findElement(By.xpath("//input[contains(text(),'Login')]")).click();
		
		//text
		//driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		
		//starts-with
		//driver.findElement(By.xpath("//button[starts-with(@name,'act')]")).click();
		
		
		//decendent
		//driver.findElement(By.xpath("//div[@class='page']//li//a[text()='About']")).click();
		

        

		
		
		
		
	}
	
	
	
	
	
	
	

}
