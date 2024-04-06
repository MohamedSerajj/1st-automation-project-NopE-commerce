import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase
{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By Login_Email = By.id("Email");
    WebElement Login_Email_Element;

    By Login_Password = By.id("Password");
    WebElement Login_Password_Element;

    By Login_Button = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    WebElement Login_Button_Element;

    public void Enter_Login_Email (String email)
    {
        Login_Email_Element = driver.findElement(Login_Email);
        Send_Keys(Login_Email_Element,email);

    }

    public void Enter_Login_Password (String pass)
    {
        Login_Password_Element = driver.findElement(Login_Password);
        Send_Keys(Login_Password_Element,pass);

    }

    public void Click_Login ()
    {
        Login_Button_Element = driver.findElement(Login_Button);
        Clicking_On_Buttons(Login_Button_Element);

    }
}
