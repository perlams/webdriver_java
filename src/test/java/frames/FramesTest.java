package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTests {

    @Test
    public void testTextContentInFrames(){

        var framesPage = homePage.clickFrameLink();
        framesPage.clickNestedFrames();
        var textLeft= framesPage.getLeftFrameText();
        assertEquals(textLeft, "LEFT", "Error in the left Frame");
        var textBottom = framesPage.getBottomFrameText();
        assertEquals(textBottom,"BOTTOM", "Error in the bottom Frame");
    }
}
