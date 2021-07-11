package common_Framework_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PauseExecutionFor {
	static WebDriverWait wait;

	public static WebElement ElementToBeClickable(WebDriver driver, WebElement element) {
		ElementToBeVisible(driver,element);
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;

	}

	public static WebElement ElementToBeVisible(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public static void visibilityOfAllElement(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void presenceOfElment(By elem) {
		wait.until(ExpectedConditions.presenceOfElementLocated(elem));
	}

}
