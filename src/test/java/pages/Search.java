package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static framework.base.DriverInterface.driver;

public class Search {

    private static By product_list_txt = By.cssSelector("#main-content > div > div.holder > div.listing");
    private By add_to_basket_btn = By.cssSelector("//*[@id=\"main-content\"]/div/div[3]/form/div/div[3]/input[2]");
    private By list_view_txt = By.cssSelector(".glyphicon.glyphicon-th-list");


    public static String getProductList() {

        WebElement products = driver.findElement(product_list_txt);
        return products.getText();

    }

    public void clickAddToBasket() {

        //new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(add_to_basket_btn)).click();

         driver.findElement(add_to_basket_btn).click();

    }


    public void clickListView() {

        new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(list_view_txt)).click();

        driver.findElement(list_view_txt).click();

    }


}
