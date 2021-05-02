package flipkartActions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import common_Framework_Functions.JavaScriptMouseOperations;
import common_Framework_Functions.PauseExecutionFor;
import common_Framework_Functions.WebButton;
import common_Framework_Functions.WebLink;
import common_Framework_Functions.WebTextBox;
import flipkartLocators.FlipkartHomePageLocators;

public class FlipkartHomePageActions {

	WebDriver driver;
	FlipkartHomePageLocators fhpl;
	WebElement ele;

	public FlipkartHomePageActions(WebDriver driver) {
		this.driver = driver;
		fhpl = new FlipkartHomePageLocators(driver);
	}

	public void closePopup() {
		ele = PauseExecutionFor.ElementToBeClickable(driver, fhpl.getClosePopup());

		if (ele != null) {
			if (ele.isEnabled()) {
				try {
					WebButton.click(ele);

				} catch (WebDriverException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void enterDeviceName(String enterDeviceName) {
		ele = PauseExecutionFor.ElementToBeClickable(driver, fhpl.getSearchTextBox());

		if (ele != null) {
			if (ele.isEnabled()) {
				try {
					WebButton.click(ele);
					WebTextBox.sendInput(ele, enterDeviceName);

				} catch (WebDriverException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void clickSearch() {
		ele = fhpl.getClickSearch();

		if (ele != null) {
			if (ele.isEnabled()) {
				try {
					WebButton.click(ele);

				} catch (WebDriverException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public void clickMobileCategory() {
		ele = fhpl.getCategoryMobile();

		if (ele != null) {
			if (ele.isEnabled()) {
				try {
					WebButton.click(ele);

				} catch (WebDriverException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void applyBrandFilter() {
		ele = fhpl.getBrandName();

		if (ele != null) {
			if (ele.isEnabled()) {
				try {
					WebButton.click(ele);
				} catch (WebDriverException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void applyAssured() {
		ele = fhpl.getAssuredChecbox();

		if (ele != null) {
			if (ele.isEnabled()) {
				try {
					JavaScriptMouseOperations.click(driver, ele);
				} catch (WebDriverException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void applySort() {
		ele = PauseExecutionFor.ElementToBeClickable(driver, fhpl.getSortBy());

		if (ele != null) {
			if (ele.isEnabled()) {
				try {
					WebLink.click(ele);

				} catch (WebDriverException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public List<String> printDetails(List<WebElement> list) {
		List<String> details = new ArrayList<>();

		Iterator<WebElement> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next().getText();
			details.add(s);
		}
		return details;

	}

	public List<String> printLinks(List<WebElement> list) {

		List<String> details = new ArrayList<>();

		for (WebElement element : list) {
			String s = element.getAttribute("href");
			details.add(s);
		}
		return details;
	}
}
