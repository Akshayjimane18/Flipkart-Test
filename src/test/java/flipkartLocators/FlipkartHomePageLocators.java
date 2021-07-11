package flipkartLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePageLocators {

	WebDriver driver;

	public FlipkartHomePageLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(css = "._2QfC02 button[class='_2KpZ6l _2doB4z']")
	private WebElement closePopup;

	public WebElement getClosePopup() {
		return closePopup;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Search for products,')]")
	private WebElement searchBoxInput;

	public WebElement getSearchTextBox() {
		return searchBoxInput;
	}

	@FindBy(xpath = "//*[@class='L0Z3Pu']")
	private WebElement search;

	public WebElement getClickSearch() {
		return search;
	}

	@FindBy(xpath = "//*[text()='Filters']/ancestor::div[3]/descendant::*[text()='Mobiles']")
	private WebElement categoryMobile;

	public WebElement getCategoryMobile() {
		return categoryMobile;
	}


	@FindBy(xpath = "//*[text()='Brand']/ancestor::section/descendant::*[text()='SAMSUNG']")
	private WebElement brandName;

	public WebElement getBrandName() {
		return brandName;
	}

	@FindBy(xpath = "//*[text()='Price']/ancestor::section/following-sibling::section[1]/descendant::input")
	private WebElement assuredChecbox;

	public WebElement getAssuredChecbox() {
		return assuredChecbox;
	}

	@FindBy(xpath = "//*[text()='Sort By']/following-sibling::div[contains(text(),'High to Low')]")
	private WebElement sortBy;

	public WebElement getSortBy() {
		return sortBy;
	}

	@FindBy(xpath = "//*[text()='Sort By']/ancestor::div[5]/div/descendant::div[16]")
	private List<WebElement> productNames;

	public List<WebElement> getProductNames() {
		return productNames;
	}

	@FindBy(xpath = "//*[text()='Sort By']/ancestor::div[5]/div/descendant::div[23]")
	private List<WebElement> displayPrice;

	public List<WebElement> getDisplayPrice() {
		return displayPrice;
	}

	@FindBy(xpath = "//*[text()='Sort By']/ancestor::div[5]/div/following-sibling::div/div/div/div/a")
	private List<WebElement> productDetailsPage;

	public List<WebElement> getProductDetailsPage() {
		return productDetailsPage;
	}
}
