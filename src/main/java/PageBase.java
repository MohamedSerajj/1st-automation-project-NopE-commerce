import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase
{
    protected WebDriver driver;

    public PageBase(WebDriver driver)
    {
        this.driver = driver;
    }

    public static void Clicking_On_Buttons (WebElement element)
    {
        element.click();
    }

    public static void Send_Keys (WebElement element , String text)
    {
        element.sendKeys(text);
    }
}
