package stepDefinitions;

import Pages.HbPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class HbSteps {

    HbPages hbPages = new HbPages(DriverFactory.getDriver());


    @When("Click to my account button")
    public void clickToMyAccountButton() {
        hbPages.clickMyAccountButton();
    }

    @When("Click to login button")
    public void clickToLoginButton() {
        hbPages.clickLoginButton();
    }

    @Then("Check to login button available")
    public void checkToLoginButtonAvailable() {
        hbPages.checkLoginButtonAvailable();

    }

    @Then("Check to e-mail box available")
    public void checkToEMailBoxAvailable() {
        hbPages.checkBoxAvailable();
    }

    @When("Write to email address")
    public void writeToEmailAddress() {
        hbPages.writeEmail();
    }

    @Then("Check to {string} message")
    public void checkToMessage(String error) {
        hbPages.checkErrorMessage(error);

    }
}


