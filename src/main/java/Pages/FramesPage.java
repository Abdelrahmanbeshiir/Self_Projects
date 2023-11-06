package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class FramesPage {
    private WebDriver driver;
    By NestedFrames=By.xpath("//a [text()='Nested Frames']");
    FramesPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public NestedFramePage ClickonNestedFrames()
    {
        driver.findElement(NestedFrames).click();
        return new NestedFramePage(driver);
    }
    public static class NestedFramePage
    {
        /***
         * class can be done in another page
         * */
        String LeftFrame="frame-left";
        String TopFrame="frame-top";
        String BottomFrame="frame-bottom";
        private WebDriver driver;
        NestedFramePage(WebDriver driver)
        {
            this.driver=driver;
        }
        public String SwitchToLeftFrameAndGetText()
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            var left=driver.switchTo().frame(TopFrame).switchTo().frame(LeftFrame);
           String result= left.findElement(By.tagName("body")).getText();
           left.switchTo().parentFrame().switchTo().parentFrame();
           return result;
        }
        public String SwitchToBottomFrameAndGetText()
        {
            var left=driver.switchTo().frame(BottomFrame);
            String result= left.findElement(By.tagName("body")).getText();
            driver.switchTo().parentFrame();
            return result;
        }

    }
}
