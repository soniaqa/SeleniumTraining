package ui2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo2 {
	
	//public static void main(String[]args) {
	@Test
		public void framing() {
		WebDriverManager. chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='iframewrapper']"));
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Alert alertonpage=driver.switchTo().alert();
		alertonpage.sendKeys("Sonia");
		alertonpage.accept();
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}
