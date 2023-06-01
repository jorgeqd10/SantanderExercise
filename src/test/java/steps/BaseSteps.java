package steps;

import io.cucumber.java.en.Given;
import po.BasePage;

public class BaseSteps {

    BasePage basePage = new BasePage();

    @Given("I am opening santander page")
    public void iAmOpeningSantandePage() {
        basePage.openSantanderPage();
    }



}
