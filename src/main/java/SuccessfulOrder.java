import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessfulOrder extends PageBase
{
    public SuccessfulOrder(WebDriver driver)
    {
        super(driver);
    }

    By Search_Text = By.id("small-searchterms");
    WebElement Search_Text_Element;

    By Search_Button = By.xpath("//button[@type= 'submit']");
    WebElement Search_Button_Element;

    By Open_Nike_Shoes = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a");
    WebElement Open_Nike_Shoes_Element;

    By Add_shoes_to_cart = By.id("add-to-cart-button-24");
    WebElement Add_shoes_to_cart_Element;

    By select_Size = By.id("product_attribute_6");
    WebElement select_Size_Element;

    By select_Color = By.id("product_attribute_7");
    WebElement select_Color_Element;

    By select_Print = By.xpath("//span [@class = 'attribute-square']");
    WebElement select_Print_Element;

    By go_to_shopping_cart = By.xpath("//a [@href = '/cart']");
    WebElement go_to_shopping_cart_element;

    By terms_checkbox = By.xpath("//input [@id = 'termsofservice']");
    WebElement terms_checkbox_element;

    By checkout_button = By.xpath("//button [@id = 'checkout']");
    WebElement checkout_button_element;

    By checkout_as_gust = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]");
    WebElement checkout_as_gust_element;

    By First_Name = By.id("BillingNewAddress_FirstName");
    WebElement First_Name_element;

    By Last_Name = By.id("BillingNewAddress_LastName");
    WebElement Last_Name_element;

    By Email = By.id("BillingNewAddress_Email");
    WebElement Email_element;

    By CountryId = By.id("BillingNewAddress_CountryId");
    WebElement CountryId_element;

    By City = By.id("BillingNewAddress_City");
    WebElement City_element;

    By Address1 = By.id("BillingNewAddress_Address1");
    WebElement Address1_element;

    By ZipCode = By.id("BillingNewAddress_ZipPostalCode");
    WebElement ZipCode_element;

    By PhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    WebElement PhoneNumber_element;

    By continue_button = By.xpath("//button [@name = 'save']");
    WebElement continue_button_element;

    By shipping_method_button = By.xpath("//*[@id=\"shippingoption_2\"]");
    WebElement shipping_method_button_element;

    By shipping_continue_button = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
    WebElement shipping_continue_button_element;

    By payment_cash = By.xpath("//*[@id=\"paymentmethod_0\"]");
    WebElement payment_cash_element;

    By submit_payment = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
    WebElement submit_payment_element;

    By payment_info_button = By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
    WebElement payment_info_button_element;

    By confirm_order_button = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
    WebElement confirm_order_button_element;

    By finish_order = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button");
    WebElement finish_order_element;



    public void Enter_Search_Text (String text)
    {
        Search_Text_Element =driver.findElement(Search_Text);
        Send_Keys(Search_Text_Element,text);
    }

    public void Click_on_Search_button ()
    {
        Search_Button_Element = driver.findElement(Search_Button);
        Clicking_On_Buttons(Search_Button_Element);
    }

    public void Open_Nike ()
    {
        Open_Nike_Shoes_Element = driver.findElement(Open_Nike_Shoes);
        Clicking_On_Buttons(Open_Nike_Shoes_Element);
    }

    public void Select_Options () throws InterruptedException {
                         // select size
        select_Size_Element = driver.findElement(select_Size);
        Select size_option = new Select(select_Size_Element);
        size_option.selectByValue("15");

                       // select color
        select_Color_Element = driver.findElement(select_Color);
        Select color_option = new Select(select_Color_Element);
        color_option.selectByValue("18");

        Thread.sleep(2000);

                      // select print
        select_Print_Element = driver.findElement(select_Print);
        Clicking_On_Buttons(select_Print_Element);


    }

    public void Add_to_cart () throws InterruptedException {
        Add_shoes_to_cart_Element = driver.findElement(Add_shoes_to_cart);
        Clicking_On_Buttons(Add_shoes_to_cart_Element);
        Thread.sleep(3000);
    }

    public void click_on_shopping_cart  () throws InterruptedException {
        go_to_shopping_cart_element = driver.findElement(go_to_shopping_cart);
        Clicking_On_Buttons(go_to_shopping_cart_element);
        Thread.sleep(2000);
    }

    public void check_out () throws InterruptedException {
        terms_checkbox_element = driver.findElement(terms_checkbox);
        Clicking_On_Buttons(terms_checkbox_element);
        Thread.sleep(2000);

        checkout_button_element = driver.findElement(checkout_button);
        Clicking_On_Buttons(checkout_button_element);
        Thread.sleep(2000);
    }

    public void as_gust () throws InterruptedException
    {
        checkout_as_gust_element = driver.findElement(checkout_as_gust);
        Clicking_On_Buttons(checkout_as_gust_element);
        Thread.sleep(2000);

    }


    public void setFirst_Name (String text) throws InterruptedException {
        First_Name_element = driver.findElement(First_Name);
        Send_Keys(First_Name_element,text);
        Thread.sleep(2000);
    }

    public void setLast_Name(String text) throws InterruptedException
    {
        Last_Name_element = driver.findElement(Last_Name);
        Send_Keys(Last_Name_element,text);
        Thread.sleep(2000);
    }

    public void setEmail(String text) throws InterruptedException{
        Email_element = driver.findElement(Email);
        Send_Keys(Email_element,text);
        Thread.sleep(2000);
    }

    public void setCountryId() throws InterruptedException{

        CountryId_element = driver.findElement(CountryId);
        Select countries = new Select(CountryId_element);
        countries.selectByValue("123");
        Thread.sleep(3000);
    }

    public void setCity(String text) throws InterruptedException{
        City_element = driver.findElement(City);
        Send_Keys(City_element,text);
        Thread.sleep(2000);
    }

    public void setAddress1(String text) throws InterruptedException{
        Address1_element = driver.findElement(Address1);
        Send_Keys(Address1_element,text);
        Thread.sleep(2000);
    }

    public void setZipCode(String text) throws InterruptedException{
        ZipCode_element = driver.findElement(ZipCode);
        Send_Keys(ZipCode_element,text);
        Thread.sleep(2000);
    }

    public void setPhoneNumber(String text) throws InterruptedException {
        PhoneNumber_element = driver.findElement(PhoneNumber);
        Send_Keys(PhoneNumber_element,text);
        Thread.sleep(2000);
    }

    public void setContinue_button() throws InterruptedException {
        continue_button_element = driver.findElement(continue_button);
        Clicking_On_Buttons(continue_button_element);
        Thread.sleep(3000);
    }

    public void setShipping_method() throws InterruptedException {
        shipping_method_button_element = driver.findElement(shipping_method_button);
        Clicking_On_Buttons(shipping_method_button_element);
        Thread.sleep(2000);

        shipping_continue_button_element = driver.findElement(shipping_continue_button);
        Clicking_On_Buttons(shipping_continue_button_element);
        Thread.sleep(2000);

    }

    public void payment () throws InterruptedException {
        payment_cash_element = driver.findElement(payment_cash);
        Clicking_On_Buttons(payment_cash_element);
        Thread.sleep(2000);

        submit_payment_element = driver.findElement(submit_payment);
        Clicking_On_Buttons(submit_payment_element);
        Thread.sleep(2000);

        payment_info_button_element = driver.findElement(payment_info_button);
        Clicking_On_Buttons(payment_info_button_element);
        Thread.sleep(2000);

    }

    public void confirm_order_and_finish () throws InterruptedException {
        confirm_order_button_element = driver.findElement(confirm_order_button);
        Clicking_On_Buttons(confirm_order_button_element);
        Thread.sleep(2000);

        finish_order_element = driver.findElement(finish_order);
        Clicking_On_Buttons(finish_order_element);
        Thread.sleep(2000);
    }
}
