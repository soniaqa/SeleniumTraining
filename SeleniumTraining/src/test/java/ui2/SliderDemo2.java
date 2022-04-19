package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo2 {
	
	//public static void main(String[]args) throws InterruptedException {
	
		@Test
		public void slider1() throws InterruptedException { 
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame1);
		
		WebElement redslider=driver.findElement(By.xpath("//*[@id=\"red\"]/div"));
		WebElement greenslider=driver.findElement(By.xpath("//*[@id=\"green\"]/div"));
		WebElement blueslider=driver.findElement(By.xpath("//*[@id=\"blue\"]"));
		
		 Actions actions=new Actions(driver);
		 actions.dragAndDropBy(redslider, -50, 100).perform();
		 Thread.sleep(2000);
		 actions.dragAndDropBy(greenslider, -50, 100).perform();
		 Thread.sleep(2000);
		 actions.dragAndDropBy(blueslider, 40, 100).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
