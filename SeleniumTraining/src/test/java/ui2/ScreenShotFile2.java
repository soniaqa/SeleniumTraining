package ui2;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotFile2 {

	 public static void main(String[]args) throws IOException {
//@Test
	//public void screen2() throws IOException {
	
	Date currentdate = new Date(0);
	String screenshotfilename=currentdate.toString().replace(" ", "-").replace(",", "-");
	System.out.println(screenshotfilename);
	
	
	WebDriverManager. chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com");
	
	File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenShot, new File(".//screenshot//"+screenshotfilename+".png"));
	
	 }
}
	
		