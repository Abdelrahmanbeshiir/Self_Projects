package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By UserNameField=By.name("username");
    private By PassWordField=By.name("password");
    private By LoginButton=By.name("radius");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void SetUserName(String username){
        driver.findElement(UserNameField).sendKeys(username);
    }
    public void SetPassWord(String password)
    {
        driver.findElement(PassWordField).sendKeys(password);
    }
    public SecureAreaPage ClickLoginButton()
    {
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver);
    }
}
