package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {
	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement slidergreen=driver.findElement(By.xpath("//*[@id=\"green\"]/div"));
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(slidergreen, -50, 100).perform();
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
