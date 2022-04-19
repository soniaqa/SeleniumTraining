package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class Locators {
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
	
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.get("/html/body/div/div[2]");
		//driver.get("xpath://input[@type='text']");
		driver.findElement(By.xpath("//input[@placeholder='Your first name']")).sendKeys("Sonia");
		//driver.get("http://www.saucedemo.com/");
		
	//	By emailLocator=RelativeLocator( ( (Object) with(By.tagName("input"))).above(By.id("password")).sendKeys("Testing"));
	//	driver.close();
		/*WebElement password = driver.findElement(By.id("password"));
		WebElement username = driver.findElement(By.id("user-name"));
		driver.findElement(withTagName("input").above(password)).sendKeys("standard_user");
		driver.findElement(withTagName("input").below(username)).sendKeys("secret_sauce");
		driver.findElement(withTagName("input").below(password)).click();
		WebElement shoppingcartcontainer = driver.findElement(By.id("menu_button_container"));
		driver.findElement(withTagName("input").near(shoppingcartcontainer)).click();
		WebElement aboutsidebarlink = driver.findElement(By.id("about_sidebar_link"));
		driver.findElement(withTagName("input").below(aboutsidebarlink)).click();
		driver.close();*/
		
	/*WebElement password=driver.findElement(By.id("password"));
	WebElement username=driver.findElement(By.id("username"));
	driver.findElement(withTagName("input").above(password	)).sendKeys("standard-user");
	driver.findElement(withTagName("input").below(username)).sendKeys("secret-sauce");
	driver.findElement(withTagName("input").below(password)).click();
    	
    	
		//WebElement username=driver.findElement(By.id("username"));*/
	}
}


