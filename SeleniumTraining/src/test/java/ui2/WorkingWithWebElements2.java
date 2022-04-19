package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements2 {
	
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();		
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.name("firstname")).clear();
		System.out.println( driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("background-color"));
		System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
		System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
		System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
		System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
		System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
		System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
		System.out.println (driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
		
		
		
	}

}
