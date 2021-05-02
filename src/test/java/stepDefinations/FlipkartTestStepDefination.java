package stepDefinations;


import flipkartActions.FlipkartHomePageActions;
import flipkartLocators.FlipkartHomePageLocators;

import java.util.List;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;


public class FlipkartTestStepDefination {
	public static WebDriver driver = Hooks.driver;

	FlipkartHomePageLocators fhpl = new FlipkartHomePageLocators(driver);
	FlipkartHomePageActions fhpa = new FlipkartHomePageActions(driver);


	@Given("^User is on flipkart website$")
	public void user_is_on_flipkart_website() throws Throwable {
		fhpa.closePopup();
	}

	@When("^Search for the product \"([^\"]*)\" on that page$")
	public void search_for_the_product_on_that_page(String arg1) throws Throwable {
		fhpa.enterDeviceName(arg1);
	}

	@When("^click on search and in categories click mobiles$")
	public void click_on_search_and_in_categories_click_mobiles() throws Throwable {

		fhpa.clickSearch();
	}

	@And("^Apply the filters brand and select assured$")
	public void apply_the_filters_brand_and_select_assured() throws Throwable {

		fhpa.applyBrandFilter();
		fhpa.applyAssured();

	}

	@And("^Sort the entries sorting$")
	public void sort_the_entries_sorting() throws Throwable {
		fhpa.applySort();
	}

	@And("^read the result of first page Product Name, Display Price and show on console$")
	public void read_the_result_of_first_page_Product_Name_Display_Price_and_show_on_console() throws Throwable {
		try {
			List<WebElement> productName = fhpl.getProductNames();
			List<WebElement> productPrice = fhpl.getDisplayPrice();
			List<WebElement> productDetails = fhpl.getProductDetailsPage();

			driver.navigate().refresh();
			System.out.println("Product Name" + fhpa.printDetails(productName));
			System.out.println("Product Price" + fhpa.printDetails(productPrice));
			System.out.println("Product Link" + fhpa.printLinks(productDetails));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
