import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SuccessfulOrder_Test_Cases extends PageBase_Test_Cases
{
    private SuccessfulOrder successfulOrder;

    SoftAssert softAssert = new SoftAssert();



    @DataProvider(name = "Test Data")  // Data Provider for test cases data
    public static Object [][] Data ()
    {
        return new Object [][]
                {
                        {"Ahmed","Khaled","Ahmed1234@gmail.com","cairo","eg","123456","01114789632"} , // valid data (happy scenario)


                };
    }




    @Test (priority = 1 , groups = "group1")
    public void Search_text ()
    {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.Enter_Search_Text("shoes");
        successfulOrder.Click_on_Search_button();

        String expected_result = driver.findElement(By.className("item-box")).getText();
        String actual_result = driver.findElement(By.className("item-box")).getText();
        softAssert.assertTrue(actual_result.contains(expected_result));


    }

    @Test (priority = 2 ,dependsOnMethods = "Search_text", groups = "group1")
    public void selected_options () throws InterruptedException {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.Open_Nike();
        successfulOrder.Select_Options();

        String expected_result = driver.findElement(By.id("product_attribute_6")).getText();
        String actual_result = driver.findElement(By.id("product_attribute_6")).getText();
        softAssert.assertTrue(actual_result.contains(expected_result));

    }

    @Test (priority = 3)
    public void Add_to_cart () throws InterruptedException {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.Add_to_cart();

    }

    @Test (priority = 4)
    public void Shopping_cart () throws InterruptedException {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.click_on_shopping_cart();

        String expected_result = driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[3]/a")).getText();
        String actual_result = driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[3]/a")).getText();
        softAssert.assertTrue(actual_result.contains(expected_result));

    }

    @Test (priority = 5)
    public void Check_out () throws InterruptedException {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.check_out();

    }

    @Test (priority = 6)
    public void Check_out_as_gust () throws InterruptedException {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.as_gust();

    }

    @Test (priority = 7 , dataProvider = "Test Data")
    public void billing_address_checkout (String fname , String lname,String email , String city,String add1,String zip,String phone) throws InterruptedException
    {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.setFirst_Name(fname);
        successfulOrder.setLast_Name(lname);
        successfulOrder.setEmail(email);
        successfulOrder.setCountryId();
        successfulOrder.setCity(city);
        successfulOrder.setAddress1(add1);
        successfulOrder.setZipCode(zip);
        successfulOrder.setPhoneNumber(phone);
        successfulOrder.setContinue_button();
    }

    @Test (priority = 8)
    public void shipping_methods () throws InterruptedException {
        successfulOrder = new SuccessfulOrder(driver);

      successfulOrder.setShipping_method();

    }

    @Test (priority = 9)
    public void payment_methods () throws InterruptedException {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.payment();

    }

    @Test (priority = 10)
    public void confirm_orders_and_finish () throws InterruptedException {
        successfulOrder = new SuccessfulOrder(driver);

        successfulOrder.confirm_order_and_finish();


    }
}
