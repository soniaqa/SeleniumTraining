package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators2 {

	public static String browser = "edge";// External configuration - XLS, CSV
	public static WebDriver driver;

	public  static void main(String[]args) {
		
		if(browser.equals("chrome")) 
		{
		WebDriverManager. chromedriver().setup();
		 driver=new ChromeDriver();
	    }
		
		
		else if(browser.equals("firefox")) 
		{
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		}
		
		
	   else if(browser.equals("edge")) 
			
	   {	
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			
	   }
	
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		WebElement driver= driver.findElement(By.id("password"));
		WebElement email=driver.findElement(with(By.tagName("input")).above("password").sendKeys("Testing"));
		
	}

	
}







