package ui;

//import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo {
	
	
	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
		
		
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
