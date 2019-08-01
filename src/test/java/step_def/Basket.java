package step_def;

import cucumber.api.java.en.And;
import pages.CustomerShopping;

public class Basket {


    @And("I click checkout button")
    public void iClickCheckoutButton() {

        CustomerShopping cs = new CustomerShopping();
        cs.clickCheckoutButton();

    }

    @And("I click continue to checkout button")
    public void iClickContinueToCheckoutButton() {

        CustomerShopping cs = new CustomerShopping();
        cs.clickContinueToCheckoutButton();
    }
}
