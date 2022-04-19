package JavascriptDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecuteUtil {

	public static void flash(WebElement element, WebDriver driver) {

		@SuppressWarnings("unused")
		String bgcolor = element.getCssValue("backgroundcolor");//green

		for (int i = 0; i < 500; i++) {
			changeColor("#000000", element, driver);
			changeColor("bgcolor", element, driver);
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" +color+ "'", element);
		
	}
	
	public static void DrawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js =( (JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px  solid blue'",element);
	}
	
	
	public static String getTitle(WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document. title;").toString();
		return title;
		
	}
	
	public static void ClickElement(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click;", element);
	}
	
	public static void GenerateAlert(WebDriver driver, String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('" + message +"')");
		
	}
	
	public static void RefreshBrowser(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}


}