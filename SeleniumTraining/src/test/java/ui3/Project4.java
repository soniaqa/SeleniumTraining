package ui3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project4 {

	public static void main(String[] args) throws InterruptedException {

		// Windows
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// DragAnaDroppable
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions action = new Actions(driver);

		action.dragAndDrop(drag, drop).perform();

		// Drag And Drop Images

		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement trash = driver.findElement(By.xpath("//*[@id=\"trash\"]"));

		action.dragAndDrop(image1, trash).perform();

		// Slider

		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']"));

		action.dragAndDropBy(slider, 150, 5).perform();

		// Resize
		WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

		action.clickAndHold(resize).moveByOffset(5, 5).release().build().perform();

		// Valunteer Signup
		WebElement element = driver.findElement(By.xpath("//*[@id=\"frame-one1434677811\"]"));
		driver.switchTo().frame(element);

		driver.findElement(By.xpath("//*[@id='RESULT_TextField-1']")).sendKeys("a");
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

	}
}
