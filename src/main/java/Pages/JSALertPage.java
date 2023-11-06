package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSALertPage {
    private  By JSAlert= By.xpath(".//button [text()='Click for JS Alert']");
    private  By JsConfirm= By.xpath(".//button [text()='Click for JS Confirm']");
    private By Alertresult=By.id("result");
    private WebDriver driver;
    JSALertPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void ClickOnJsAlert()
    {
        driver.findElement(JSAlert).click();
    }
    public void AcceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    public String GetResult()
    {
      return driver.findElement(Alertresult).getText();
    }
    public void ClickOnJsConfirm()
    {
        driver.findElement(JsConfirm).click();
    }
    public void Alert_DismissConfirmAlert()
    {
        driver.switchTo().alert().dismiss();
    }
    public void Alert_ConfirmAlert()
    {
        driver.switchTo().alert().accept();
    }
    public String GetMsgOnJsConfirm()
    {
       return driver.switchTo().alert().getText();
    }


}
