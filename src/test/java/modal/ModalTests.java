package modal;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTests extends BaseTests {

    @Test
    public void testModal(){

        var modalPage = homePage.clickModalLink();
        var text= modalPage.getText();
        modalPage.closeModal();
        assertEquals(text, "THIS IS A MODAL WINDOW", "error in the modal");

    }
}
