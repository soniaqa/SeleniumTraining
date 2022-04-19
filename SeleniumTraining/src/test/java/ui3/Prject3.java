package ui3;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prject3 {
	
	public static void main(String[]args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*driver.findElement(By.xpath("//*[@id=\"post-2673\"]/div[2]/div/div"));
		//driver.switchTo().frame(element);
		//Thread.sleep(2000);
		//WebElement redslider=driver.findElement(By.xpath("//*[@id='red']"));
		Thread.sleep(5000);
		WebElement greenslider=driver.findElement(By.xpath("//*[@id=\"green\"]/div"));
		
		Actions action = new Actions(driver);
		//action.dragAndDropBy(redslider, 100, -60).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(greenslider, 100, 50).perform();*/
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p"));
		//driver.switchTo().frame(element);
		
		Thread.sleep(5000);
		//WebElement drag=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		
	}

}
