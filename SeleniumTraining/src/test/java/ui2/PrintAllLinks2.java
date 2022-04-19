package ui2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks2 {
	
	public static void  main(String[]args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/");
		
		List <WebElement> alltags=driver.findElementsByTagName("a");
		System.out.println("Total tags on page are  "+alltags.size());
		
		for( int i=0;i<alltags.size();i++)
		{
			System.out.println("Total links on page are "+alltags.get(i).getAttribute("href"));
			System.out.println("Total links on page are "+alltags.get(i).getText());
		}
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
	}

}
