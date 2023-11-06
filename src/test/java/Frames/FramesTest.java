package Frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTests {
    @Test
    public void TestFrames()
    {
        var Framespage=homePage.ClickFrames();
        var NestedFrames =Framespage.ClickonNestedFrames();
        Assert.assertEquals(NestedFrames.SwitchToLeftFrameAndGetText(),"LEFT","Error Switching");
        Assert.assertEquals(NestedFrames.SwitchToBottomFrameAndGetText(),"BOTTOM","Error");
    }
}
