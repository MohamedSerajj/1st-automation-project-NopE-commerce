import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class AddToCart_Test_Cases extends PageBase_Test_Cases
{
    private AddToCart addToCart;

    SoftAssert softAssert = new SoftAssert();

    @Test (priority = 1)
    public void Add_computer () throws InterruptedException
    {
        addToCart = new AddToCart(driver);


        addToCart.Open_computer_item();
        addToCart.Select_computer_options();
        addToCart.Click_Add_To_Cart();

        String expected_result_for_added_item = driver.findElement(By.className("bar-notification-container")).getText();
        String actual_result_for_added_item = driver.findElement(By.className("bar-notification-container")).getText();
        softAssert.assertTrue(actual_result_for_added_item.contains(expected_result_for_added_item));
        softAssert.assertAll();



    }


    @Test (priority = 2)
    public void Check_Added_computer_to_shopping_cart ()
    {
        addToCart = new AddToCart(driver);

        addToCart.Clicking_on_shopping_cart();

        String expected_result_for_shopping_cart = driver.findElement(By.xpath("//td [@class = 'product']")).getText();
        String actual_result_for_shopping_cart = driver.findElement(By.xpath("//td [@class = 'product']")).getText();
        softAssert.assertAll();
    }

}
