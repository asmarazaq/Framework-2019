package home;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class MainPage extends BaseUtil {


    @FindBy(how = How.XPATH, using = "html[1]/body[1]/div[1]/div[5]/header[1]/div[4]/div[3]/a[1]")
    public WebElement searchButton;

    public WebElement getSearchButton() {
    return searchButton;
    }

    public void clickOnSearchButton() {
    TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    getSearchButton().click();
    }

    @FindBy(how = How.XPATH, using = "html[1]/body[1]/div[1]/div[5]/header[1]/div[4]/div[2]/a[1]/span[1]")
    public WebElement getChase;

    public WebElement getGetChase() {
    return getChase;
    }

    public void clickonGetChase() {
    TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    getGetChase().click();
    }

    @FindBy(how = How.XPATH, using = "html[1]/body[1]/div[1]/div[5]/header[1]/div[4]/div[1]/div[1]/div[1]/a[1]")
    public WebElement Openanaccount;

    public WebElement getOpenanaccount() {
    return Openanaccount;
    }

    public void clickOnSignIn() {
    TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    getOpenanaccount();
}
}
