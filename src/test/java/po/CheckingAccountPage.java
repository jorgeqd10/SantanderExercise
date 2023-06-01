package po;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class CheckingAccountPage extends BasePage {

    @FindBy(css = "div #fragment-0-lcba")
    private WebElement santanderSelectBox;

    @FindBy(css = "div #fragment-0-lcba")
    private WebElement simplyRightBox;

    @FindBy(css = "div #fragment-0-lcba")
    private WebElement studentValueBox;

    @FindBy(xpath = "//div[@class='div2']/child::a[2]/p/u")
    private WebElement openAccountSimplyLnk;


    public CheckingAccountPage(){
        PageFactory.initElements(this.driverSup, this);
    }

    public void verifyCheckingOptions(){
        wait.until(ExpectedConditions.visibilityOf(santanderSelectBox)).isDisplayed();
        simplyRightBox.isDisplayed();
        studentValueBox.isDisplayed();
    }

    public void clickSimplyRightOpenAccountLnk(){
        openAccountSimplyLnk.click();
    }

    public void verifyWindowURL(String input){
        ArrayList<String> tabs2 = new ArrayList<String>(this.driverSup.getWindowHandles());
        this.driverSup.switchTo().window(tabs2.get(tabs2.size()-1));
        String currentUrl = this.driverSup.getCurrentUrl();
        Assert.assertEquals(input, currentUrl);
    }

}
