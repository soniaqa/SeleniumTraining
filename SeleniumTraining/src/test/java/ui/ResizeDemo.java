package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.tigervnc.rfb.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeDemo {
	public static void main(String[]args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions action =new Actions(driver);
		Thread.sleep(2000);
		action.clickAndHold(element).moveByOffset(80,60).release().build().perform();
		
		

		
		
		
		
		
		
		
	}

}
