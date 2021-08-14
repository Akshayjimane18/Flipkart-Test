package stepDefinations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import common_Framework_Functions.GetPropertyValue;
import common_Framework_Functions.IConfigurable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;

import common_Framework_Functions.LocalDriverFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hooks implements IConfigurable {
    public static WebDriver driver = null;

    @Before("@FirstFeature")
    public void configuration() {

        if (GetPropertyValue.getPropertyValueObject().getProperyValue("runLocalBrowser").equalsIgnoreCase("false")) {
            MutableCapabilities sauceOptions = new MutableCapabilities();
            sauceOptions.setCapability("build", "Java-W3C-Examples");
            sauceOptions.setCapability("seleniumVersion", "3.141.59");
            sauceOptions.setCapability("username", "akshaymane04");
            //sauceOptions.setCapability("password","30AKSmane#");
            sauceOptions.setCapability("accessKey", "cb0ed849-3d50-4948-8992-a0c26ec1182f");
            //sauceOptions.setCapability("tags","w3c-chrome-tests"); //Not required because of that there was a error

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("sauce:options", sauceOptions);
            desiredCapabilities.setCapability("browserVersion", "latest");
            desiredCapabilities.setCapability("platformName", "windows 10");


            desiredCapabilities.setCapability("browserName", GetPropertyValue.getPropertyValueObject().getProperyValue("browser"));


            //--Driver URL = https://akshaymane04:cb0ed849-3d50-4948-8992-a0c26ec1182f@ondemand.apac-southeast-1.saucelabs.com:443/wd/hub
            try {
                driver = new RemoteWebDriver(new URL("https://ondemand.apac-southeast-1.saucelabs.com:443/wd/hub"), desiredCapabilities);
            } catch (MalformedURLException e) {
                System.out.println(e);
            }
        } else {
            driver = LocalDriverFactory.createInstance(GetPropertyValue.getPropertyValueObject().getProperyValue("browser"));
        }

        if (GetPropertyValue.getPropertyValueObject().getProperyValue("URL").equalsIgnoreCase("fkpKartProduction")) {
            driver.get(GetPropertyValue.getPropertyValueObject().getProperyValue("fkpKartProduction"));
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
