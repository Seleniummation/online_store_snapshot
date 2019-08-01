package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static framework.base.DriverInterface.driver;

public class CustomerAccount {



    //WebElement
    private By myEmail_txt = By.name("email");
    private By yesMyPasswordIs_txt = By.id("password");
    private By signIn_btn = By.id("login");
    private By forgottenYourPassword_lnk = By.cssSelector("#login > div:nth-child(8) > a");

    //Validation
    private static By signIn_or_register_txt = By.cssSelector("#login > h2:nth-child(4)");


    public void setMyEmail(String myemail){

        driver.findElement(myEmail_txt).sendKeys(myemail);
        //driver.findElement(By.name("mail")).sendKeys(password);

    }

    public void setYesMyPasswordIs(String password){

        driver.findElement(yesMyPasswordIs_txt).sendKeys(password);

    }

    public void clickSignIn(){

        driver.findElement(signIn_btn).submit();


    }

    public static String getSignInOrRegisterText(){

        WebElement signInRegister =driver.findElement(signIn_or_register_txt);
        return signInRegister.getText();
    }


    public void clickForgottenYourPassword(){

        driver.findElement(forgottenYourPassword_lnk).click();


    }
}
