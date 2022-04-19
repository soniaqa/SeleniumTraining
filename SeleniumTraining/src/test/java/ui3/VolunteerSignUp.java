package ui3;

import java.io.IOException;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VolunteerSignUp {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://goo.gl/KNZ6Sr");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Valunteer Signup
		WebElement element=driver.findElement(By.xpath("//*[@id=\"frame-one1434677811\"]"));
		driver.switchTo().frame(element);
	
		driver.findElement(By.xpath("/html/body/form/div[2]/div[4]/input")).sendKeys("a");
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-2']")).sendKeys("b");
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-3']")).sendKeys("222222222");
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-4']")).sendKeys("US");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("NY");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("rcvacademy@gamil.com");
		driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[4]/td/label")).click();
		WebElement time = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
		time.click();

		Select select = new Select(time);
		select.selectByVisibleText("Afternoon");
		
		driver.findElement(By.xpath(".//*[@id=\"RESULT_FileUpload-10\"]")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\praka\\OneDrive\\Documents\\FileUploadScript.exe");

	}

}
