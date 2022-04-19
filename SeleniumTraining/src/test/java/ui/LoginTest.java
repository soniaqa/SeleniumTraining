package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
		
	@Parameters({"browser"})
	@Test
	public void launchApplication (String browser) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\praka\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		if(browser.equals("chrome")) {
			ChromeDriverManager.getInstance().setup();
			 driver=new ChromeDriver();
			
			 
		}else if(browser.equals("Firefox")) {
			FirefoxDriverManager.getInstance().setup();
			 driver=new FirefoxDriver();
			
			 
		}else if(browser.equals("edge")){
			EdgeDriverManager.getInstance().setup();
			driver=new EdgeDriver();
		
			
		}
		
		driver.get("http://www.saucedemo.com/");		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();		
		driver.close();
	}

}
