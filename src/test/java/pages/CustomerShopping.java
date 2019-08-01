package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static framework.base.DriverInterface.driver;

public class CustomerShopping {

    private static By basket_txt = By.cssSelector("#shopping_cart > table > tbody > tr.js-product-row");
    private By checkout_btn = By.cssSelector("#centerCol > div > div > div.basket__right-col > div > div.basket-payment-buttons > a");
    private By continue_to_checkout_btn = By.cssSelector("#upsell-form > div.upsell-actions > a");

    public static String getBasketItems() {

        new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(basket_txt));


        WebElement itemsInBasket = driver.findElement(basket_txt);
        return itemsInBasket.getText();

    }


    public void clickCheckoutButton() {

        driver.findElement(checkout_btn).click();

    }


    public void clickContinueToCheckoutButton() {

        driver.findElement(continue_to_checkout_btn).click();

    }
}
