package ui;

import java.sql.Time;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxDemo {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(("https://www.sugarcrm.com/request-demo/"));
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("interest_market_c0")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")));
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		driver.manage().window().maximize();
		driver.findElement(By.id("interest_market_c0")).click();
		
		//driver.manage().window().fullscreen();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


