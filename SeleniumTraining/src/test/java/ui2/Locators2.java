package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

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
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Testing");
		
	}
}







