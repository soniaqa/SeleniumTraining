package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop2 {
	public static void main(String[]args) {
		
		
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
	
	    WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));
	    
	    
	    Actions actions=new Actions(driver);
	    actions.dragAndDrop(drag, drop).perform();

}
}