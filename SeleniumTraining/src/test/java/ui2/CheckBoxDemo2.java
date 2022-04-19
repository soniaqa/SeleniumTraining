package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo2 {
	public static void main(String[]args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.sugarcrm.com/request-demo/");
	driver.findElement(By.xpath("//input[@id='doi0']"));
	
	driver.findElement(By.id("interest_market_c0")).click();
	driver.findElement(By.id("interest_market_c0")).click();
}
}
