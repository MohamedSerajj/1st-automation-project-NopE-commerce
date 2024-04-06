import org.testng.annotations.Test;

public class HomePage_Test_Cases extends PageBase_Test_Cases
{
    private HomePage homePage;
    private PageBase pageBase;

    @Test
    public void tests ()
    {
        homePage = new HomePage(driver);
        homePage.Click_On_Register_Button();
        homePage.Click_On_Login_Button();

    }

}
