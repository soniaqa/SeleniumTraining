package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo2 {

	public static void main(String[]args) {
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element1).perform();
		
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[4]/a"));
		action.moveToElement(element2).click().perform();
		
		
		
		
		
		
		
		
		
		
		
	}
}
