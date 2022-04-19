package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RatioButtonDemo {
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();	
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.singaporeair.com/en_UK/us/home#/book/bookflight");
	    driver.manage().window().maximize();
	    

       WebElement radio1=driver.findElement(By.id("bookFlights"));
	   radio1.click();
	   System.out.println(radio1.isSelected());
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
