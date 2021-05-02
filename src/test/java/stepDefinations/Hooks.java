package stepDefinations;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import common_Framework_Functions.LocalDriverFactory;

public class Hooks {
	public static WebDriver driver = null;
	
	@Before("@FirstFeature")
	public void configuration() {
		driver = LocalDriverFactory.createInstance("chrome");
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	

}
