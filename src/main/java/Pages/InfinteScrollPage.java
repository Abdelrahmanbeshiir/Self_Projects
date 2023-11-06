package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class InfinteScrollPage {
    private WebDriver driver;
    By TextBlocks= By.className("jscroll-added");
    InfinteScrollPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void ScrollTopragraph(int index)
    {
        String script="window.scrollTo(0,document.body.scrollHeight)";
        var JsExecuter=(JavascriptExecutor)driver;
        while (getNumberofParagraphPresent()<index) {
          JsExecuter.executeScript(script);
        }
    }
    public int getNumberofParagraphPresent(){
        return driver.findElements(TextBlocks).size();
    }
}