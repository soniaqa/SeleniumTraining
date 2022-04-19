package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesDemo {
	public static void main(String[]args) {
		
		
		
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/");
		driver.findElement(By.xpath("/html/body/div[1]/hgf-globalnavigation//header/div[2]/div/div/div/div/div[1]/div[3]/div/div[2]/div/a/span")).click();
		
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		
	    Iterator<String> iterator=windowhandles.iterator();
	    String parentwindow=iterator.next();
	    String childwindow=iterator.next();
	    
	    driver.switchTo().window(childwindow);
		

	    driver.findElement(By.name("UserFirstName")).sendKeys("RCV");
		driver.findElement(By.name("UserLastName")).sendKeys("Academy");
		
		
		
		
		
		
		
		
	}
	

}
