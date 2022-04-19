package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeDemo {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_default");
		driver.manage().window().maximize();
		//driver.switchTo().frame("iframeResult");
		WebElement frame1=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		//String alertText =driver.switchTo().alert().getText();
		//System.out.println(alertText);
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
