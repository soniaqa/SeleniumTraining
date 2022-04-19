package JavascriptDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DrawBorderAndScreenShot {

	public static void main(String[] args) throws IOException {
	
	
		System.setProperty("webdriver.gecko.driver",  "C:\\Users\\praka\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		//DrawBorder
	    WebElement element=	driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
	    
	    JavascriptExecuteUtil.DrawBorder(element, driver);
	    
	    //screenshot
	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File trg=new File("C:\\Users\\praka\\OneDrive\\Documents\\SoftwareTesting\\screenshot\\twoplugs.png");
	   FileUtils.copyFile(src, trg);

	}

}
