import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CompareTwoItem_Test_Cases extends PageBase_Test_Cases
{
    private CompareTwoItem compareTwoItem;

    SoftAssert softAssert = new SoftAssert();

    @Test (priority = 1)
    public void Search () throws InterruptedException {
        compareTwoItem = new CompareTwoItem(driver);

        compareTwoItem.Enter_Text_In_Search("laptop");
        compareTwoItem.Click_In_Search_Button();

        String lenovo_expected = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/h2/a")).getText();
        String lenovo_actual = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/h2/a")).getText();
        Assert.assertEquals(lenovo_actual,lenovo_expected);

        String asus_expected = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a")).getText();
        String asus_actual = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a")).getText();
        Assert.assertEquals(asus_actual,asus_expected);

        softAssert.assertAll();

    }

    @Test (priority = 2)
    public void view_compare () throws InterruptedException {
        compareTwoItem = new CompareTwoItem(driver);


        compareTwoItem.Comparison_two_products();
        compareTwoItem.View_Compare();

        String lenovo_expected_compare_list = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]/a")).getText();
        String lenovo_actual_compare_list = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]/a")).getText();
        Assert.assertEquals(lenovo_actual_compare_list,lenovo_expected_compare_list);

        String asus_expected_compare_list = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/a")).getText();
        String asus_actual_compare_list = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/a")).getText();
        Assert.assertEquals(asus_actual_compare_list,asus_expected_compare_list);

        softAssert.assertAll();


    }
}
