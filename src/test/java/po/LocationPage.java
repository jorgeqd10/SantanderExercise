package po;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LocationPage extends BasePage{
    public LocationPage(){
        PageFactory.initElements(this.driverSup, this);
    }

    @FindBy(css = "#q")
    private WebElement zipCodeField;

    @FindBy(css = "#search-button")
    private WebElement searchBtn;

    @FindBy(xpath = "//div[@class='map-list-wrap map-list-tall']/child::ul/li")
    private WebElement branchBox;

    @FindBy(css = ".js-number-of-results")
    private WebElement branchNumberReturned;

    @FindBy(xpath = "//div[contains(text(), 'Found 0 location near 00000')]")
    private WebElement noBranchErrorMsg;

    public void enterZipCode(String value){
        wait.until(ExpectedConditions.visibilityOf(zipCodeField)).clear();
        wait.until(ExpectedConditions.visibilityOf(zipCodeField)).sendKeys(value);
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
    }

    public void verifyBranchesReturned(String value){
        int branchReturned = Integer.parseInt(branchNumberReturned.getText());
        int branches = Integer.parseInt(value);
        Assert.assertEquals(branches, branchReturned);
    }

    public void branchErrorMsg(){
        wait.until(ExpectedConditions.visibilityOf(noBranchErrorMsg));
    }


}
