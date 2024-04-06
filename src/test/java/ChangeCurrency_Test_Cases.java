import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ChangeCurrency_Test_Cases extends PageBase_Test_Cases
{
    private ChangeCurrency changeCurrency;

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void setChangeCurrency () throws InterruptedException {

        changeCurrency = new ChangeCurrency(driver);
        changeCurrency.Customer_Change_Currency();


    }

}
