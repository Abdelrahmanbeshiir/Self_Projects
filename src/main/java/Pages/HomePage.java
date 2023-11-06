package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public  HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public LoginPage ClickformAuthentication()
    {
        ClinkOnLink("Form Authentication");
        return new LoginPage(driver);
    }
    private void ClinkOnLink(String s)
    {
        driver.findElement(By.linkText(s)).click();
    }
    public DropDownListPage ClickOnDropDown()
    {
        ClinkOnLink("Dropdown");
        return new DropDownListPage(driver);
    }
    public HoverPage ClickOnHover()
    {
        ClinkOnLink("Hovers");
        return new HoverPage(driver);
    }
    public KeyPressPage ClickOnKeyPress()
    {
        ClinkOnLink("Key Presses");
        return new KeyPressPage(driver);
    }
    public JSALertPage ClickOn_JS_Alerts()
    {
        ClinkOnLink("JavaScript Alerts");
        return new JSALertPage(driver);
    }
    public FileuploadPage ClickFileUpload()
    {
        ClinkOnLink("File Upload");
        return new FileuploadPage(driver);
    }
    public FramesPage ClickFrames()
    {
        ClinkOnLink("Frames");
        return new FramesPage(driver);
    }
    public LargeAndDeepPage ClickonLargeAndDeepPage()
    {
        ClinkOnLink("Large & Deep DOM");
        return new LargeAndDeepPage(driver);
    }
    public InfinteScrollPage ClickonInfinteScrollPage()
    {
        ClinkOnLink("Infinite Scroll");
        return new InfinteScrollPage(driver);
    }


}
