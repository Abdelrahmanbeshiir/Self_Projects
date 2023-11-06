package FileUploaded;

import base.BaseTests;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;

public class TestUpload extends BaseTests {
    @Test
    public void TestUploaded()
    {
        var upload_page=homePage.ClickFileUpload();
        upload_page.UploadFile("D:\\ITI learning\\java\\projects\\SeleniumTAU\\src\\main\\resources\\images.jpg");
        upload_page.Presssubmit();
        Assert.assertEquals(upload_page.GetUploaded(),"images.jpg");
    }
}
