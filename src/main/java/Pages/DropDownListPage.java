package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DropDownListPage {
    private WebDriver driver;
    private By DropDownField=By.id("dropdown");
    DropDownListPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void SelectfromDropDown(String option)
    {
        FindDropDownElement().selectByVisibleText(option);
    }
    public List<String> GetSelectedOption()
    {
       List<WebElement> SelectedElements= FindDropDownElement().getAllSelectedOptions();
       return  SelectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public Select FindDropDownElement(){
        return new Select(driver.findElement(DropDownField));
    }

}
