package utiliti;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    //this method will click on element
    public void clickelement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    ///this method send text on element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String gettextfrom(By by){
        return  driver.findElement(by).getText();
    }


}
