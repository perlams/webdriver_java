package infiniteScroll;

import base.BaseTests;
import org.testng.annotations.Test;

public class InfiniteScrollTests extends BaseTests {

    @Test
    public void testScrolltoFifthParagraph(){
        homePage.clickInfiniteScrollLink().scrollToParagraph(5);
    }

}
