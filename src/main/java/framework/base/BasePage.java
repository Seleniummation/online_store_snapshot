package framework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static framework.base.DriverInterface.driver;

public class BasePage extends Base {

    //WebElement
    private  By signIn_lnk = By.cssSelector(".site-header__link");
    private By search_txt_fld  = By.id("search-box");
    private By search_btn  = By.id("search-button");



    //Validation
    private static By usrname_txt = By.cssSelector("body > header > div > div:nth-child(4) > div > span");

            public void clickSignInLink(){

                List<WebElement> signIn = driver.findElements(signIn_lnk);
                signIn.get(1).click();
            }

            public static String getUserName(){

                WebElement usrName = driver.findElement(usrname_txt );
                return  usrName.getText();

            }

            public void setSearch(String product){

                driver.findElement(search_txt_fld).sendKeys(product);
            }

            public void clickSearchButton(){

                driver.findElement(search_btn).submit();

    }


    }











