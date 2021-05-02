package common_Framework_Functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Alerts {

	public static String getJsAlertText(WebDriver driver) {
		Object txt = ((JavascriptExecutor) driver).executeScript("return window.alert.myAlertText");
		return (String) txt;
	}

	public static void alertClick(WebDriver driver) {

		driver.switchTo().alert().accept();
	}

}
