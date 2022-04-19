package ui2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods2 {

	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		driver.navigate().to("https://google.com");
		
		driver.close();
		
		
	}
}
