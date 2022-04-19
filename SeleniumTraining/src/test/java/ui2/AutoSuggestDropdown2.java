package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown2 {
	
	public static void main(String[]args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebElement click1=(driver.findElement(By.xpath("//span[text()='From']")));
		Actions actions = new Actions(driver);
		actions.moveToElement(click1).click().perform();
		

	    WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
	    Thread.sleep(2000);
	    from.sendKeys("Albany");
	    Thread.sleep(2000);
	    from.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    from.sendKeys(Keys.ENTER);

}
}