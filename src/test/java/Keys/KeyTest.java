package Keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ARROW_RIGHT;
import static org.openqa.selenium.Keys.chord;

public class KeyTest extends BaseTests {
    @Test
    public void VerfiyKey()
    {
        var keypage=homePage.ClickOnKeyPress();
        String text="h";
        keypage.WriteONWritingField(chord(Keys.F1));
        String result =keypage.GetText();
        Assert.assertEquals(result,"You entered: "+"RIGHT");
    }
}
