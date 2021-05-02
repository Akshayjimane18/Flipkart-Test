package common_Framework_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	// static WebDriver driver;

	public static void mouseHoverOnElement(WebElement toElement, WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(toElement).build();
		action.perform();
	}

	public static void clickOnElement(WebElement toElement, WebDriver driver) {
		Actions builder = new Actions(driver);
		builder.moveToElement(toElement).click().build().perform();

	}

	// public static void
}
