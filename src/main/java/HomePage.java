import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    By Register_Button = By.className("ico-register");
    WebElement Register_Button_Element ;

    By Login_Button = By.className("ico-login");
    WebElement Login_Button_Element ;

    public RegisterPage Click_On_Register_Button () // this function to move from home to register page so the return is register
    {
        Register_Button_Element = driver.findElement(Register_Button);
        Clicking_On_Buttons(Register_Button_Element);
        return new RegisterPage(driver); // to move the driver from home page to register page
    }

    public LoginPage Click_On_Login_Button ()
    {
        Login_Button_Element = driver.findElement(Login_Button);
        Clicking_On_Buttons(Login_Button_Element);
        return new LoginPage(driver);
    }


}
