package ScrollingTests;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LargeAndDeepTest extends BaseTests {

    private WebDriver driver;

    @Test
    public void ScrolltoFifth(){
        homePage.ClickonInfinteScrollPage().ScrollTopragraph(5);
    }
    @Test
    public void ScrollPageDown(){
        var scrollpage =homePage.ClickonLargeAndDeepPage();
        scrollpage.ScrollPageDown();
        Assert.assertTrue(scrollpage.ISTableDisplayed());

    }
}
