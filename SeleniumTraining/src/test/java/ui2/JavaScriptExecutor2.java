package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor2 {
	
	//public static void main(String[]args) throws InterruptedException {
		@Test
		public void javascript() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		
		// print the title

		JavascriptExecutor jsexec = (JavascriptExecutor) driver;

		String script = " return document.title;";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title);
		
		
		//click button
		driver.switchTo().frame("iframeResult");
		jsexec.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		//highlight
		WebElement button=driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='3px solid red'", button);
		
		
		//scroll
		driver.navigate().to("https://www.w3schools.com/java/");
		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"getdiploma\"]/a"));
		jsexec.executeScript("arguments[0].scrollIntoView(true)", scroll);	
		
	}

}