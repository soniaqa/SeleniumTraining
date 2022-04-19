package JavascriptDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptFlashDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\praka\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
	    WebElement element=	driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		JavascriptExecuteUtil.flash(element, driver);
	}

}
