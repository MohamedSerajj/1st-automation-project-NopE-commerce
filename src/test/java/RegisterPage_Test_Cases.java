import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPage_Test_Cases extends PageBase_Test_Cases
{
    private HomePage homePage; // open home page at the first to move to register page so we must take an object from this class
    private RegisterPage registerPage; /* we take an object from register page to call that here
                                         and we can't move to register page without open home page at the first */




    SoftAssert softAssert = new SoftAssert(); /* soft assertions */

    @DataProvider(name = "Test Data")  // Data Provider for test cases data
    public static Object [][] Data ()
    {
        return new Object [][]
                {
                        {"tomsmith","SuperSecretPassword!","gmail","2244","1456"} , // invalid data (mail,confirm pass)
                        {"tomsm","  ", "gmail","0000","0000"},   // invalid data (empty last name)
                        {"mohamed","seraj","mohamed2030@gmail.com","123456789","123456789"} // valid data

                };
    }



    @Test (dataProvider = "Test Data")
    public void Register_TC (String fname,String lname,String mail,String pass,String conpass)
    {
        homePage = new HomePage(driver); // initialize home page and send it the driver
        registerPage = homePage.Click_On_Register_Button(); /*once we click on register button in home page
                                                            we move it to register page to fill information
                                                            so that the reason for initialize this registerpage */


        registerPage.Choose_Male_Gender();
        registerPage.Enter_First_name(fname);
        registerPage.Enter_Last_name(lname);
        registerPage.Enter_Email(mail);
        registerPage.Enter_Password(pass);
        registerPage.Enter_Confirmed_Password(conpass);
        registerPage.Click_Register();


        String expected_result = "Your registration completed";
        String actual_result = driver.findElement(By.xpath("//div [@class = 'result']")).getText();
        softAssert.assertTrue(actual_result.contains(expected_result));



    }

}
