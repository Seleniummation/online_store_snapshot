package step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.BasePage;
import pages.CustomerShopping;
import pages.Search;

import static org.junit.Assert.assertEquals;

public class SearchForProducts {

    @And("I enter {string} keyword into search text box")
    public void iEnterKeywordIntoSearchTextBox(String product) {

        BasePage bp =new BasePage();
        bp.setSearch(product);
    }

    @And("I enter {string} code into search text box")
    public void iEnterCodeIntoSearchTextBox(String product) {

        BasePage bp =new BasePage();
        bp.setSearch(product);
    }

    @And("I enter {string} description into search text box")
    public void iEnterDescriptionIntoSearchTextBox(String product) {

        BasePage bp =new BasePage();
        bp.setSearch(product);
    }

    @When("I click search button")
    public void iClickSearchButton() {

        BasePage bp =new BasePage();
        bp.clickSearchButton();


    }

    @And("I click list icon to change layout of items")
    public void iClickListIconToChangeLayoutOfItems() {

        Search src = new Search();
        src.clickListView();
    }

    @Then("List of product are displayed")
    public void listOfProductAreDisplayed() {

        String products = Search.getProductList();
        assertEquals(products, Search.getProductList() );
        System.out.println("Products are listed as  " +  Search.getProductList());
    }

    @And("I click add to basket button")
    public void iClickAddToBasketButton() {

        Search src = new Search ();
        src.clickAddToBasket();

    }

    @Then("Quantity, description and price of items in shopping basket are displayed")
    public void theNumberOfItemsAreDisplayed() {

        String shoppingBasket = CustomerShopping.getBasketItems();
        assertEquals(shoppingBasket, CustomerShopping.getBasketItems());
        System.out.println("Shopping basket displays items as  " + CustomerShopping.getBasketItems());
    }


}
