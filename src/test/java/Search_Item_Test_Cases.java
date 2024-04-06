import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Search_Item_Test_Cases extends PageBase_Test_Cases
{

    private Search_Item search_item;

    SoftAssert softAssert = new SoftAssert(); /* soft assertions */

    @Test (priority = 1)
    public void Correct_Search ()
    {

        search_item = new Search_Item(driver);
         search_item.Search_Bar("apple");
         search_item.Click_Search();


         String expected_result = driver.findElement(By.xpath("//a[@href='/apple-icam']")).getText();
         String actual_result = driver.findElement(By.xpath("//a[@href='/apple-icam']")).getText();
         softAssert.assertTrue(actual_result.contains(expected_result));



    }

    @Test (priority = 2)
    public void Failed_Search ()
    {

        search_item = new Search_Item(driver);
        search_item.Search_Bar("shoes");
        search_item.Click_Search();


        String expected_result = driver.findElement(By.xpath("//a[@href='/apple-icam']")).getText();
        String actual_result = driver.findElement(By.xpath("//a[@href='/apple-icam']")).getText();
        softAssert.assertTrue(actual_result.contains(expected_result));



    }
}
