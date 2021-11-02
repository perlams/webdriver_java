package iframes;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IFramesTests extends BaseTests {

    @Test
    public void testFrames(){
        var iframePage = homePage.clickIFrameLink();
        String firstPhrase= "Hello ";
        String secondPhrase = "World";

        iframePage.clearTextArea();
        iframePage.setTextArea(firstPhrase);
        iframePage.increaseIndention();
        iframePage.setTextArea(secondPhrase);
        var text = iframePage.getTextFromEditor();
        assertEquals(text, firstPhrase + secondPhrase, "Text from editor is not the expected");


    }
}
