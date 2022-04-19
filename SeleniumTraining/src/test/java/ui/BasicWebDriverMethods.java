package ui;

//import java.util.List;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
//import static org.openqa.selenium.support.locators.RelativeLocator.*;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

//import org.openqa.selenium.By;

public class BasicWebDriverMethods {
	public static String browser="chrome";// External configuration - XLS, CSV

	public static WebDriver driver;
	
	
	public static void main(String[]args) {

		if(browser.equals("chrome")) {
			ChromeDriverManager.getInstance().setup();
			 driver=new ChromeDriver();
			 
		}else if(browser.equals("firefox")) {
			FirefoxDriverManager.getInstance().setup();
			 driver=new FirefoxDriver();
			 
		}else if(browser.equals("edge")){
			EdgeDriverManager.getInstance().setup();
			driver=new EdgeDriver();
			
		}
		

	  /*  driver.get("http://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    
	    String currenturl= driver.getCurrentUrl();
	    System.out.println(currenturl);
	
	    String title= driver.getTitle();
	    System.out.println(title);
	  
	    String pagesource= driver.getPageSource();
	    System.out.println(pagesource);
	 
	    driver.navigate().to("http://google.com");
	    driver.close();*/
	
	
	driver.get("http://www.saucedemo.com/");
	driver.findElement(By.id("username")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
	WebElement webelements= driver.findElement(By.xpath("//div[@class='inventory_list']/div"));
	System.out.println(webelements); 
	
	/*driver.navigate().to("http://www.sugarcrm.com//");
	String windowhandle=driver.getWindowHandle();
	System.out.println(windowhandle);*/
	
}
}

