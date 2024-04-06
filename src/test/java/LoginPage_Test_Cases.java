import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPage_Test_Cases extends PageBase_Test_Cases
{
    private HomePage homePage;
    private LoginPage loginPage;

    SoftAssert softAssert = new SoftAssert(); /* soft assertions */

    @DataProvider (name = "Test Data")
    public static Object [] [] Data ()
    {
        return new Object[][]
                {
                        {"gmail","787878"}, // invalid email
                        {"mohamed770@gmail.com","8800"}, // invalid password
                        {"mohamed2030@gmail.com","123456789"} // valid data

                };
    }

    @Test (dataProvider = "Test Data")
    public void Login_TCs (String mail,String pass)
    {
        homePage = new HomePage(driver);
       loginPage = homePage.Click_On_Login_Button();

       loginPage.Enter_Login_Email(mail);
       loginPage.Enter_Login_Password(pass);
       loginPage.Click_Login();

       String expected_result = driver.findElement(By.className("ico-logout")).getText();
       String actual_result = driver.findElement(By.className("ico-logout")).getText();
       softAssert.assertTrue(actual_result.contains(expected_result));




    }

}
