package ui;

import java.time.Duration;
//import java.time.Duration;
//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {
	
	
	
	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
		
		/*Wait <WebDriver> wait=new FluentWait <WebDriver> (driver)
		    .withTimeout(Duration.ofSeconds(10))
		    .pollingEvery(Duration.ofSeconds(2))
		    .withMessage("RCV Academy: This is custom message")
		    .ignoring(NoSuchElementException.class);*/
		
		
		
		
		
		
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

