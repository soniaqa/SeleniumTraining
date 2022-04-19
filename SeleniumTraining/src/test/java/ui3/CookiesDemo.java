package ui3;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CookiesDemo {
	
	public static void main(String[]args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		//get size of cookies
		Set <Cookie> cookies=driver.manage().getCookies();
		System.out.println("Set of cookies " +cookies.size());
		
		//add cookie
		Cookie cookie=new Cookie("sony0521205","19882016");
				driver.manage().addCookie(cookie);
				cookies=driver.manage().getCookies();
				
				
				//get size of cookies
				/*Set <Cookie> cookies1=driver.manage().getCookies();
				System.out.println("Set of cookies " +cookies1.size());*/
				
		
		
		//print all the cookies
		/*for(Cookie cookie1:cookies1)
		{
			System.out.println (cookie1.getName()+":"+cookie1.getValue());
		}*/
		
		//delete specific cookie
		driver.manage().deleteCookieNamed("sessiion-id");
		
		//print all cookies
		/*for(Cookie cookie1:cookies1)
		{
			System.out.println (cookie1.getName()+":"+cookie1.getValue());
		}*/
		
	
		driver.close();
		
		
		//print specific cookie
		//System.out.println (driver.manage().getCookieNamed("session-id"));
		
		
		//add cookie
		/*Cookie cookie=new Cookie("sony0521205","19882016");
		driver.manage().addCookie(cookie);
		cookies=driver.manage().getCookies();*/
		
	}

}
