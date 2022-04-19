package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthenticationDemo {
	public static String username="admin"; //  Reading thing this on XSL OR CSV
	public static String password="admin";// Reading thing this on XSL OR CSV
	
	
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().browserVersion("97.0.4692.99").setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
	}
}
