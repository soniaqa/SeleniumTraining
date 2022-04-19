package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2 {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		WebElement ddown=driver.findElement(By.name("employees_c"));
		
		Select select=new Select(ddown);
		
		
		
		select.selectByValue("level3");
		Thread.sleep(2000);
		
		select.selectByVisibleText("101-250 employees");
		Thread.sleep(2000);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
	}
	

}
