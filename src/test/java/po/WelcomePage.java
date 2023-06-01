package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BasePage{

    @FindBy(css = "#better-btn-02")
    private WebElement checkingGetStartedBtn;

    @FindBy(css = "#find01")
    private WebElement findBranchBtn;

    public WelcomePage(){
        PageFactory.initElements(this.driverSup, this);
    }

    public void clickingGetCheckingAccount(){
        wait.until(ExpectedConditions.elementToBeClickable(checkingGetStartedBtn)).click();
    }

    public void clickFindBranchBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(findBranchBtn)).click();
    }


}
