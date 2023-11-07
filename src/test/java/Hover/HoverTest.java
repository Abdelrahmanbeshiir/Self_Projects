package Hover;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends BaseTests {
    @Test
    public void Testhover()
    {
        var Hoverpage=homePage.ClickOnHover();
        var Fig1=Hoverpage.HoverOverFig(1);
        Assert.assertTrue(Fig1.isCaptionDisplayed());
        Assert.assertEquals(Fig1.GetTheHeader(),"name: user1","Caption is not Displayed");
        Assert.assertEquals(Fig1.getLink(),"https://the-internet.herokuapp.com/users/1",
                "The Link is in correct");
        Assert.assertTrue(Fig1.getLink().endsWith("/users/1"),"link is incorrect");
        Assert.assertEquals(Fig1.GetTheFooter(),"View profile","The Link Text is in correct");
    }
}
