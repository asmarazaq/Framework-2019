package testHome;

import home.MainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends MainPage {
    MainPage cb = null;

    @Test
    public void Test () {
    cb = PageFactory.initElements(driver, MainPage.class);
    cb.clickOnSearchButton();
    }

    @Test
    public void Test1() {
    cb = PageFactory.initElements(driver,MainPage.class);
    cb.clickonGetChase();
    }
    @Test
    public void Test2() {
    cb = PageFactory.initElements(driver,MainPage.class);
    cb.clickOnSignIn();
    }
}