package step_def;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.Base;
import framework.base.BasePage;
import pages.CustomerAccount;
import pages.CustomerForgot;
import pages.LandingPage;

import static org.junit.Assert.assertEquals;

public class SignIn  {

    @Given("I am on ebuyer home page")
    public void iAmOnEbuyerHomePage() {

        LandingPage.launchUrl();

    }

    @When("I click sign in link")
    public void iClickSignInLink() {

        BasePage bp = new BasePage();
        bp.clickSignInLink();

        //BasePage.clickSignInLink();

    }

    @Then("Sign in or register text is displayed")
    public void signInOrRegisterTextIsDisplayed() {

        String expected = "Sign In or Register";
        assertEquals(expected, CustomerAccount.getSignInOrRegisterText());
        System.out.println("Page displays text as " +  CustomerAccount.getSignInOrRegisterText());
    }


    @When("I click forgotten your password link")
    public void iClickForgottenYourPasswordLink() {

        CustomerAccount ca = new CustomerAccount();
        ca.clickForgottenYourPassword();
    }

    @Then("Forgot your password text is displayed")
    public void forgotYourPasswordTextIsDisplayed() {

        String expected ="Forgot your password?";
        String actualResult = CustomerForgot.getForgotYourPasswordText();
        assertEquals(expected, actualResult );
        System.out.println("Page displays text as " +  actualResult);
    }

    @And("I enter {string} and {string} credentials")
    public void iEnterAndCredentials(String myemail, String password) {


        CustomerAccount ca = new CustomerAccount();
        ca.setMyEmail(myemail);
        ca.setYesMyPasswordIs(password);
    }

    @And("I click the sign in button")
    public void iClickTheSignInButton() {

        CustomerAccount ca = new CustomerAccount();
        ca.clickSignIn();

    }

    @Then("My username is displayed")
    public void myUsernameIsDisplayed() {

        String expected = BasePage.getUserName();
        assertEquals(expected, BasePage.getUserName());
        System.out.println("Page displays username as " +  BasePage.getUserName());
    }



}

