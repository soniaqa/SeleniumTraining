package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvent2 {
	
	public static void main(String[]Args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement sourcearea=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		
		Actions actions=new Actions(driver);
		actions.keyDown(sourcearea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement destinarea=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		//driver.switchTo().frame(destinarea);
		
		actions.keyDown(destinarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
