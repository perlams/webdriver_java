package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectionOption(){

        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFormDropDown(option);
        var selectedOptions = dropDownPage.getSelectOptions();
        assertEquals(selectedOptions.size(), 1, "incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "option not selected");

    }
}
