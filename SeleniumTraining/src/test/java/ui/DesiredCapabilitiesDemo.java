package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
//import okio.Options;

public class DesiredCapabilitiesDemo {
	
	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		ChromeOptions coptions=new ChromeOptions();
		coptions.merge(dc);
		
		ChromeDriver driver=new ChromeDriver(coptions);
		driver.get("https://expired.badssl.com/");
	}

}
