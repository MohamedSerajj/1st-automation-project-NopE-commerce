import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AddToCart extends PageBase
{
    public AddToCart(WebDriver driver)
    {
        super(driver);
    }

    By Open_Item_1_Computer = By.xpath("//a[@href= '/build-your-own-computer']");
    WebElement Open_Item_1_Computer_Element ;

    By Add_computer_to_the_cart = By.id("add-to-cart-button-1");
    WebElement Add_computer_to_the_cart_Element ;

    By shopping_cart_button = By.xpath("//a [@class = 'ico-cart']");
    WebElement shopping_cart_button_Element;

    public void Open_computer_item ()
    {
        Open_Item_1_Computer_Element = driver.findElement(Open_Item_1_Computer);
        Clicking_On_Buttons(Open_Item_1_Computer_Element);
    }

    public void Select_computer_options ()
    {

        WebElement RAM_optionlist = driver.findElement(By.id("product_attribute_2"));
        Select options = new Select(RAM_optionlist);
        options.selectByValue("4");

        WebElement HDD_check_box = driver.findElement(By.id("product_attribute_3_7"));
        HDD_check_box.click();

    }

    public void Click_Add_To_Cart () throws InterruptedException
    {
        Add_computer_to_the_cart_Element = driver.findElement(Add_computer_to_the_cart);
        Clicking_On_Buttons(Add_computer_to_the_cart_Element);
        Thread.sleep(6000); // wait to remove alert (added successfully)
    }

    public void Clicking_on_shopping_cart ()
    {
        shopping_cart_button_Element = driver.findElement(shopping_cart_button);
        Clicking_On_Buttons(shopping_cart_button_Element);


    }



}
