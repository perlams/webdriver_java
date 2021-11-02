package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void slideBar(){
        String value = "4";
        var horizontalSlidePage = homePage.clickHorizontalSlideLink();
        horizontalSlidePage.moveSlider(value);
        var result= horizontalSlidePage.getResult();
        assertEquals(result, value, "Error in the slider value");
    }
}
