package ui3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {
	
	public static void main(String[] ags) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();

//Scrolling by pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");

		// scrolling by using element
		WebElement flags = driver
				.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]"));
		js.executeScript("arguments[0].scrollIntoView();", flags);

		// Scroll till bottom
		js.executeScript("window,scrollTo(0,document.body.scrollHeight)");

	}

}
