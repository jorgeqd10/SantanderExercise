package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.CheckingAccountPage;

public class CheckingAccountSteps {
    CheckingAccountPage checkingAccountPage = new CheckingAccountPage();


    @Then("I verify checking account options")
    public void iVerifyCheckingAccounts() {
        checkingAccountPage.verifyCheckingOptions();
    }

    @And("I click open account for simply right checking")
    public void clickSimplyRightOpenAccountLnk() {
        checkingAccountPage.clickSimplyRightOpenAccountLnk();
    }

    @Then("I verify web title {string}")
    public void iVerifyWebTitle(String input) {
        checkingAccountPage.verifyWindowURL(input);
    }
}
