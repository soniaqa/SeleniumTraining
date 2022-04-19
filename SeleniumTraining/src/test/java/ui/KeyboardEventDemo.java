package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventDemo {

	
	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://extendsclass.com/text-compare.html");
	    driver.manage().window().maximize();
	    
	    WebElement sourcearea=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[9]/pre/span"));
	    
	    
	     Actions action =new Actions(driver);
	     action.keyDown(sourcearea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	     
	     
	     
	    WebElement destinationarea =driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre/span")) ;
	    action.keyDown(destinationarea,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	     
	     
	     
	     
	
	
	
	}
}
