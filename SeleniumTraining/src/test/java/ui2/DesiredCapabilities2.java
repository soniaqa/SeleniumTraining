package ui2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities2 {

	public static void main(String[]args) {
		
		WebDriverManager. chromedriver().setup();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions options=new ChromeOptions();
		options.merge(dc);
		
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
	}
}
