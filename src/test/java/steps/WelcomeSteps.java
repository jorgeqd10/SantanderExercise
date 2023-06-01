package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import po.WelcomePage;

public class WelcomeSteps {

    WelcomePage welcomePage = new WelcomePage();

    @Then("I clicking get started button from checking accounts")
    public void iClickingGetStartedButtonFromCheckingAccounts() {
        welcomePage.clickingGetCheckingAccount();
    }

    @Then("I click find the branch button")
    public void iClickFindTheBranchButton() {
        welcomePage.clickFindBranchBtn();
    }
}
