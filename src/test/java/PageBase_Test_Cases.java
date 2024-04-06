import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PageBase_Test_Cases
{
    protected WebDriver driver;



    @BeforeTest
    public void Open_Page()
    {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void Quit_Page ()
    {
        driver.quit();
    }

}
