package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.LocationPage;

public class LocationSteps {
    LocationPage locationPage = new LocationPage();

    @Then("I enter {string} zipcode and search")
    public void iEnterZipcodeAndSearch(String zipCode) {
        locationPage.enterZipCode(zipCode);
    }

    @And("I verify {string} branch boxes are displayed")
    public void iVerifyBranchBoxesAreDisplayed(String input) {
        locationPage.verifyBranchesReturned(input);
    }

    @And("I verify error message zip code")
    public void iVerifyErrorMessageZipCode() {
        locationPage.branchErrorMsg();
    }
}
