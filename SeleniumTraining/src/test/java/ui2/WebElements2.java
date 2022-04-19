package ui2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements2 {
	
	
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> webelement=driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelement);
		
		driver.navigate().to("https://www.sugarcrm.com/request-demo/");
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		
		driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).click();
		Set<String>windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		
		driver.close();
		
		
	}

	
	
}
