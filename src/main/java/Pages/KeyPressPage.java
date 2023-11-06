package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    By WritingField = By.id("target");
    By Result =By.id("result");
    private WebDriver driver;
    KeyPressPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void  WriteONWritingField(String text)
    {
        var Field =driver.findElement(WritingField);
        Field.sendKeys(text);
    }
    public String GetText(){
        var result=driver.findElement(Result);
        return result.getText();
    }
}
