package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By StatusAlert= By.id("flash");
    public SecureAreaPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public String GetAlertText(){
       return driver.findElement(StatusAlert).getText();
    }
}
