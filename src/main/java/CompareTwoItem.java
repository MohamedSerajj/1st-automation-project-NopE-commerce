import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompareTwoItem extends PageBase
{
    public CompareTwoItem(WebDriver driver) {
        super(driver);
    }

    By Search_Text = By.id("small-searchterms");
    WebElement Search_Text_Element;

    By Click_Search = By.xpath("// button [@type = 'submit']");
    WebElement Click_Search_Element;

    By ASUS_PRODUCT = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[2]");
    WebElement ASUS_PRODUCT_Element;

    By LENOVO_PRODUCT = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[2]");
    WebElement LENOVO_PRODUCT_Element;

    By View_Compare_List = By.xpath("//a[@href = '/compareproducts']");
    WebElement View_Compare_List_Element;

    public void Enter_Text_In_Search (String text)
    {
        Search_Text_Element = driver.findElement(Search_Text);
        Send_Keys(Search_Text_Element,text);
    }

    public void Click_In_Search_Button () throws InterruptedException {
        Click_Search_Element = driver.findElement(Click_Search);
        Clicking_On_Buttons(Click_Search_Element);
        Thread.sleep(3000);
    }

    public void Comparison_two_products () throws InterruptedException {
        ASUS_PRODUCT_Element = driver.findElement(ASUS_PRODUCT);
        Clicking_On_Buttons(ASUS_PRODUCT_Element);
        Thread.sleep(2000);
        LENOVO_PRODUCT_Element = driver.findElement(LENOVO_PRODUCT);
        Clicking_On_Buttons(LENOVO_PRODUCT_Element);
        Thread.sleep(2000);

    }

    public void View_Compare () throws InterruptedException {
        View_Compare_List_Element = driver.findElement(View_Compare_List);
        Clicking_On_Buttons(View_Compare_List_Element);
        Thread.sleep(3000);
    }






}
