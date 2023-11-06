package Alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTests {
    @Test
    public void TestAlert()
    {
        var AlertPage=homePage.ClickOn_JS_Alerts();
        AlertPage.ClickOnJsAlert();
        AlertPage.AcceptAlert();
        Assert.assertEquals(AlertPage.GetResult(),"You successfully clicked an alert");


    }
    @Test
    public void TestConfirmationAlert()
    {
        var AlertPage=homePage.ClickOn_JS_Alerts();
        AlertPage.ClickOnJsConfirm();
        Assert.assertEquals(AlertPage.GetMsgOnJsConfirm(),"I am a JS Confirm");
        AlertPage.Alert_ConfirmAlert();
        Assert.assertEquals(AlertPage.GetResult(),"You clicked: Ok");

    }
    @Test
    public void TestDismissAlert()
    {
        var AlertPage=homePage.ClickOn_JS_Alerts();
        AlertPage.ClickOnJsConfirm();
        Assert.assertEquals(AlertPage.GetMsgOnJsConfirm(),"I am a JS Confirm");
        AlertPage.Alert_DismissConfirmAlert();
        Assert.assertEquals(AlertPage.GetResult(),"You clicked: Cancel");
    }
}
