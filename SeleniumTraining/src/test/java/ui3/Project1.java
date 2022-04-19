package ui3;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 {
	public static void main(String[]args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//TextArea
		driver.findElement(By.id("name")).sendKeys("u");
		driver.findElement(By.id("phone")).sendKeys("2");
		driver.findElement(By.id("email")).sendKeys("rcv@gmail.com");
		driver.findElement(By.id("password")).sendKeys("popsy");
		driver.findElement(By.id("address")).sendKeys("pearl street");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button")).click();
		
		//DropDownBox
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("saturday")).click();
		WebElement ratio=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/select"));
		ratio.click();
		
		Select select=new Select(ratio);
		select.selectByVisibleText("Norway");
		
		//CheckBox&RadioButton
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div[1]/label")).click();
		
		
		//FileInputStream
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='custom-file-input']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\praka\\OneDrive\\Documents\\FileUploadScript.exe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[6]/div[2]/div/div/div[2]/span")).click();
		
		
		
		
		
	
		
	
		
		
	}

}
