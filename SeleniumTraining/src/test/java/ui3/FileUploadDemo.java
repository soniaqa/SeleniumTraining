package ui3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\praka\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.filemail.com/share/upload-file");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"addBtn\"]/span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\praka\\OneDrive\\Desktop\\FileUpload1.exe");
		
	}

}
