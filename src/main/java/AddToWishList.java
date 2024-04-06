import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToWishList extends PageBase
{
    public AddToWishList(WebDriver driver)
    {
        super(driver);
    }

    By Open_Mobile_Page = By.partialLinkText("HTC One M8");
    WebElement Open_Mobile_Page_Element;

    By Add_Mobile_To_WishList = By.id("add-to-wishlist-button-18");
    WebElement Add_Mobile_To_WishList_Element;

    By WishList = By.className("ico-wishlist");
    WebElement WishList_Element ;

    public void Open_Mobile_Page ()
    {
        Open_Mobile_Page_Element = driver.findElement(Open_Mobile_Page);
        Clicking_On_Buttons(Open_Mobile_Page_Element);
    }

    public void Add_To_WishList () throws InterruptedException {
        Add_Mobile_To_WishList_Element = driver.findElement(Add_Mobile_To_WishList);
        Clicking_On_Buttons(Add_Mobile_To_WishList_Element);
        Thread.sleep(4000);
    }

    public void Open_WishList ()
    {
        WishList_Element = driver.findElement(WishList);
        Clicking_On_Buttons(WishList_Element);

    }


}
