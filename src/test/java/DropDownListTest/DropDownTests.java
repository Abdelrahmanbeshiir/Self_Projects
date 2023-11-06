package DropDownListTest;

import Pages.HomePage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTests {
    @Test
    public void TestSelect()
    {
       var dropDownpage= homePage.ClickOnDropDown();
       String Option="Option 1";
        dropDownpage.SelectfromDropDown(Option);
        var GetSelected =dropDownpage.GetSelectedOption();
        Assert.assertEquals(GetSelected.size(),1,"Error count must be one");
        Assert.assertTrue(GetSelected.contains(Option));
        System.out.println(GetSelected);

    }

}
