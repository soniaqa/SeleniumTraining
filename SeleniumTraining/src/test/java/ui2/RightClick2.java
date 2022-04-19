package ui2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick2 {
	public static void main(String[] Args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame1);

		WebElement squarebox = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));

		Actions actions = new Actions(driver);
		actions.contextClick(squarebox).perform();

	}

}
