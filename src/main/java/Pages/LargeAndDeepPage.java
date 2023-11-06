package Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;

public class LargeAndDeepPage {
    private WebDriver driver;
    By Table= By.id("large-table");
    By Header1= By.id("header-1");
    public LargeAndDeepPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void ScrollPageDown()
    {
        WebElement TableElement=driver.findElement(Table);
        String script="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, TableElement,TableElement);

    }
    public Boolean ISTableDisplayed()
    {
        WebElement TableElement=driver.findElement(Table);
        String script="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, TableElement,TableElement);
       return  driver.findElement(Header1).isDisplayed();

    }
}
