package pages;

import framework.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static framework.base.DriverInterface.driver;

public class CustomerForgot  extends Base {

    //Validation
    private static By forgotYourPassword_txt = By.cssSelector("#checkoutHeader > h2");

    public static String getForgotYourPasswordText(){

        WebElement forgotYourPasswrd =driver.findElement(forgotYourPassword_txt );
        return forgotYourPasswrd.getText();
    }
}
