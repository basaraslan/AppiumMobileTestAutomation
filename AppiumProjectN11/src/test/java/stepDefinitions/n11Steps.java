package stepDefinitions;

import Pages.n11Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class n11Steps {

    n11Pages n11pages = new n11Pages(DriverFactory.getDriver());


    @When("user clicks category button")
    public void userClicksCategoryButton() {
        n11pages.clickCategoryButton();
    }

    @When("user clicks electronic button")
    public void userClicksElectronicButton() {
        n11pages.clickElectronic();

    }

    @When("user clicks telephone and accessories button")
    public void userClicksTelephoneAndAccessoriesButton() {
        n11pages.clickTelephoneAccessory();
    }


    @When("user selects telephone")
    public void userSelectsTelephone() {
        n11pages.selectTelephone();

    }

    @When("user selects brand")
    public void userSelectsBrand() {
        n11pages.selectBrand();
    }

    @When("user clicks filter button")
    public void userClicksFilterButton() {
        n11pages.clickFilter();

    }

    @When("user makes filters")
    public void userMakesFilters() {
        n11pages.makeFilter();

    }

    @When("user clicks result button")
    public void userClicksResultButton() {
        n11pages.clickResultButton();

    }

    @When("user clicks add chart button")
    public void userClicksAddChartButton() {
        n11pages.clickAddChartButton();
    }

    @When("user clicks chart button")
    public void userClicksChartButton() {
        n11pages.clickChartButton();

    }

    @Then("user view desired product")
    public void userViewDesiredProduct() {
        n11pages.viewDesired();
    }


}
