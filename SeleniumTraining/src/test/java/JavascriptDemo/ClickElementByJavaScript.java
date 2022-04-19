package JavascriptDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElementByJavaScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		//login
		Thread.sleep(3000);
	    WebElement	login=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
	    Thread.sleep(3000);
		JavascriptExecuteUtil.ClickElement(login, driver);
		
		
		//alert message
		JavascriptExecuteUtil.GenerateAlert(driver, "You have clicked on login button");

	}

}
