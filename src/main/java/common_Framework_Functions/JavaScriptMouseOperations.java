package common_Framework_Functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMouseOperations {
	static JavascriptExecutor executor;

	public static void click(WebDriver driver, WebElement element) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView()", element);
		executor.executeScript("arguments[0].click();", element);

	}

	public static void scrollToElement(WebDriver driver, WebElement element) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView()", element);
		

	}

}
