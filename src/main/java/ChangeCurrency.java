import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChangeCurrency extends PageBase
{
    public ChangeCurrency(WebDriver driver)
    {
        super(driver);
    }

    By Customer_Currency = By.xpath("//*[@id=\"customerCurrency\"]");
    WebElement Customer_Currency_Element;

    public void Customer_Change_Currency () throws InterruptedException
    {

        Customer_Currency_Element = driver.findElement(Customer_Currency);
        Clicking_On_Buttons(Customer_Currency_Element);
        Thread.sleep(3000);
        Select option = new Select(Customer_Currency_Element);
        option.selectByVisibleText("Euro");

    }
}
