package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.contextClick();
        var text =contextMenuPage.getText();
        contextMenuPage.acceptAlert();
        assertEquals(text,"You selected a context menu", "error in the alert" );

    }
}
