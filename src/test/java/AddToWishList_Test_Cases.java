import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddToWishList_Test_Cases extends PageBase_Test_Cases
{
    private AddToWishList addToWishList;

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void WishList_Tests () throws InterruptedException {
        addToWishList = new AddToWishList(driver);

        addToWishList.Open_Mobile_Page();
        addToWishList.Add_To_WishList();

        addToWishList.Open_WishList();
        String expected = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[4]/a")).getText();
        String actual = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[4]/a")).getText();
        Assert.assertEquals(actual,expected);


    }
}
