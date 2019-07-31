package step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CustomerAccount;
import pages.CustomerForgot;

import static org.junit.Assert.assertEquals;

public class SignInRefactored {

    @Then("{string} is displayed")
    public void isDisplayed(String verification) {

        switch(verification) {
            case "Sign in or register text":
                String expected = "Sign In or Register";
                assertEquals(expected, CustomerAccount.getSignInOrRegisterText());
                System.out.println("Page displays text as " +  CustomerAccount.getSignInOrRegisterText());
                break;

            case "Forgot your password text":
                String expect = "Forgot your password?";
                assertEquals(expect, CustomerForgot.getForgotYourPasswordText());
                System.out.println("Page displays text as " +  CustomerForgot.getForgotYourPasswordText());
                break;

        }



    }


}
