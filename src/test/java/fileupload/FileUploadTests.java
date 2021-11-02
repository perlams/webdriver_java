package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){

        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("/Users/perlams/IdeaProjects/webdriver_java/src/main/resources/images/tomato.png");
        var result= fileUploadPage.getUploadedFiles();
        assertEquals(result,"tomato.png","Error file name");

    }

}
