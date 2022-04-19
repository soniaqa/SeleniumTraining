package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();
		//ChromeDriverManager.getInstance().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement ddown= driver.findElement(By.name("employees_c"));
		
		Select select=new Select(ddown);
		WebElement firstoption=select.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		
		select.selectByValue("level1");
		Thread.sleep(2000);
		select.selectByVisibleText("51 - 100 employees");
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


