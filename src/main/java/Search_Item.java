import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_Item extends PageBase
{
    public Search_Item(WebDriver driver)
    {
        super(driver);
    }

    By Search_Bar_text = By.name("q");
    WebElement Search_Bar_text_Element;


    By Search_Button = By.xpath("// button [@type = 'submit']");
    WebElement Search_Button_Element;




    public void Search_Bar (String text)
    {
        Search_Bar_text_Element = driver.findElement(Search_Bar_text);
        Send_Keys(Search_Bar_text_Element,text);
    }

    public void Click_Search ()
    {
        Search_Button_Element = driver.findElement(Search_Button);
        Clicking_On_Buttons(Search_Button_Element);

    }
}
