package common_Framework_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;


public class LocalDriverFactory {

	public static WebDriver createInstance(String browserName) {
		WebDriver driver = null;
		if (browserName.toLowerCase().contains("firefox")) {
			System.out.println("launching firefox browser");

			File filepath = new File("Driver");
			File fs = new File(filepath, "geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", fs.getAbsolutePath());
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	        capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);

			return driver;
		}
		if (browserName.toLowerCase().contains("ie")) {
			System.out.println("launching IE browser");
			//WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			return driver;
		}
		if (browserName.toLowerCase().contains("chrome")) {
			System.out.println("launching Chrome browser");
			File filepath = new File("Driver");
			File fs = new File(filepath, "chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", fs.getAbsolutePath());
			driver = new ChromeDriver();
			return driver;
		}
		if (browserName.toLowerCase().contains("opera")) {
			System.out.println("launching Opera browser");
			File filepath = new File("Driver");
			File fs = new File(filepath, "operadriver.exe");
			System.setProperty("webdriver.opera.driver", fs.getAbsolutePath());
			driver = new OperaDriver();
			return driver;
		}
		if(browserName.toLowerCase().contains("phantomJS")) {
			
			
		}
		return driver;
	}
}
