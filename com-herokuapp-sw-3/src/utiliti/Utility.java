package utiliti;

import browserfactory.BestTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BestTest {
    //this method will click on element
    public void clickonelement(By by){
        WebElement element=driver.findElement(by);
        element.click();
    }
    //this method get text from element
    public void gettexttoelement(By by, String name){
        driver.findElement(by).sendKeys(name);

    }
    //this method will get text from element
    public String gettextfromelement(By by){
        return driver.findElement(by).getText();

    }


}
