package common_Framework_Functions;

import org.openqa.selenium.WebElement;

public interface WebButton {
    //This is constructor
    /*
     * This method is to click on Web Button
     * @Param : WebElement
     * @Return : None
     */
    public static void click(WebElement ele) {
        ele.click();
    }
}
