package ui2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo2 {
	
	public static void main(String[]args) {
		
		
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement radio1=driver.findElement(By.xpath("//li[@class='selected']"));
		radio1.click();
		
		Actions action=new Actions(driver);
		action.moveToElement(radio1).click().perform();
		
		System.out.println(radio1.isSelected());
		
		System.out.println(driver.findElement(By.xpath("//span[@class='tabsCircle appendRight5']")).getSize());
		

}
}
