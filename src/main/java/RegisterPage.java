import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase
{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    By Male_Gender = By.id("gender-male");
    WebElement Male_Gender_Element ;

    By First_name = By.id("FirstName");
    WebElement First_name_Element ;

    By Last_name = By.id("LastName");
    WebElement Last_name_Element ;

    By Email = By.id("Email");
    WebElement Email_Element ;

    By Password = By.id("Password");
    WebElement Password_Element ;

    By Confirm_Password = By.id("ConfirmPassword");
    WebElement Confirm_Password_Element ;

    By Register_button = By.id("register-button");
    WebElement Register_button_Element ;




    public void Choose_Male_Gender ()
    {
        Male_Gender_Element = driver.findElement(Male_Gender);
        Clicking_On_Buttons(Male_Gender_Element);
    }

    public void Enter_First_name (String fname)
    {
        First_name_Element = driver.findElement(First_name);
        Send_Keys(First_name_Element,fname);
    }

    public void Enter_Last_name (String lname)
    {
        Last_name_Element = driver.findElement(Last_name);
        Send_Keys(Last_name_Element,lname);
    }

    public void Enter_Email (String email)
    {
        Email_Element = driver.findElement(Email);
        Send_Keys(Email_Element,email);
    }

    public void Enter_Password (String pass)
    {
        Password_Element = driver.findElement(Password);
        Send_Keys(Password_Element,pass);
    }

    public void Enter_Confirmed_Password (String confirm_pass)
    {
        Confirm_Password_Element = driver.findElement(Confirm_Password);
        Send_Keys(Confirm_Password_Element,confirm_pass);
    }


    public void Click_Register ()
    {
        Register_button_Element = driver.findElement(Register_button);
        Clicking_On_Buttons(Register_button_Element);
    }





}
