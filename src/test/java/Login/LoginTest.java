package Login;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {
    @Test
    public void TestSuccssfulLogin()
    {
       LoginPage loginPage= homePage.ClickformAuthentication();
       loginPage.SetUserName("tomsmith");
       loginPage.SetPassWord("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.ClickLoginButton();
        Assert.assertTrue(secureAreaPage.GetAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
