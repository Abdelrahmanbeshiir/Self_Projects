package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class HoverPage {
    private WebDriver driver;
    By figureBox= By.className("figure");
    By BoxCaption=By.className("figcaption");
    HoverPage(WebDriver driver)
    {
        this.driver=driver;
    }
    /**
     *
     * @param index start at 1
     */
    public FigureCaption HoverOverFig(int index)
    {
       WebElement figure=driver.findElement(By.xpath("(//div[@class='figure'])["+(index)+"]"));
      //  WebElement figure=driver.findElement(figureBox).get(index-1);
        Actions actions=new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(BoxCaption));
    }
    public class FigureCaption{
        private WebElement caption;
        private By Header= By.tagName("h5");
        private By Footer=By.tagName("a");
        public FigureCaption(WebElement caption)
        {
            this.caption=caption;

        }
        public Boolean isCaptionDisplayed()
        {
            return caption.isDisplayed();
        }
        public String GetTheHeader()
        {
          return caption.findElement(Header).getText();
        }
        public String GetTheFooter()
        {
            return caption.findElement(Footer).getText();
        }
        public String getLink()
        {
            return caption.findElement(Footer).getAttribute("href");
        }
    }

}
