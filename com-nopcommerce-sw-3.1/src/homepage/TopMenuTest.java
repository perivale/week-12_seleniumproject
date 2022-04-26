package homepage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class TopMenuTest extends Utility {
  public String baseurl="https://demo.nopcommerce.com/";
    @Before
    public void openbrowser1(){
        //opening browser
        openbrowser(baseurl);
    }

    public void selectmenu(String menu){
       clickonelement(By.linkText(menu));

    }
    @Test
    public  void  verifyPageNavigation(String electronics, String actualName){
      //find the element of menu tab
      String navigationName = getTextFromElement(By.linkText("Electronics"));
      //call the selectmenu for click on navigation to other page
      selectmenu(navigationName);
      //find the text of navigation page
      String actualName1= getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));
      //verify the navigation page text
      verifyPageNavigation("Electronics",actualName);


    }
}
