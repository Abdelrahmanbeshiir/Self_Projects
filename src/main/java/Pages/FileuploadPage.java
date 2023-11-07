package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FileuploadPage {
    private WebDriver driver;
    private By fileupload= By.id("file-upload");
    private By Submit= By.id("file-submit");
    private By UploadedFile= By.id("uploaded-files");
    FileuploadPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void UploadFile(String path)
    {
        driver.findElement(fileupload).sendKeys(path);
    }
    public void Presssubmit()
    {
        driver.findElement(Submit).click();
    }
    public String GetUploaded()
    {
        return driver.findElement(UploadedFile).getText();
    }


}
