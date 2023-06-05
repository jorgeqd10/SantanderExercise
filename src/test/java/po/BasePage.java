package po;

import driver.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends Driver {

    protected WebDriverWait wait;

    public BasePage() {
        PageFactory.initElements(this.driverSup, this);
        wait = new WebDriverWait(this.driverSup, Duration.ofSeconds(30));
    }

    public void openSantanderPage(){
        getDriver().manage().window().maximize();
        getDriver().get("https://www.santanderbank.com/");
    }


}
