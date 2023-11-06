package base;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void SetUp()
    {
        System.setProperty("webdriver.chromedriver","resources/chromedriver");
        driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
        driver.manage().window().maximize();

    }
   @BeforeMethod
   public void GoHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void CloseBrowser() {
      driver.quit();
    }
}
