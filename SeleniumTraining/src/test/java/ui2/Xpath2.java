package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2 {
	
	
	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
		//driver.get("https://developer.salesforce.com/signup");
         
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input#user-name")).sendKeys("RCV Academy");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sonia");
		driver.findElement(By.cssSelector("input[name^='password']")).sendKeys("Sonia");
		//driver.findElement(By.xpath("//a[text()='Privacy Statement']")).click();
		
		//driver .findElement(By.xpath("//input[@id='user-name' or name='user-name']")).sendKeys("Sonia");
	}

}
