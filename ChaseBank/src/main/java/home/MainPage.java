package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class MainPage extends CommonAPI {


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

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[5]/header[1]/div[4]/div[3]/ul[1]/li[3]/a[1]")
    public static WebElement signin;

    public void clicksignin() {
        signin.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signin.click();
    }


    @FindBy(how = How.XPATH, using = "//a[@class='header__section--dropdown__title__link chaseanalytics-track-link']")
    public static WebElement openanaccount;

    public void clickopenanaccount() {
        openanaccount.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        openanaccount.click();
    }

    @FindBy(how = How.XPATH, using = "//a[@class='chaseanalytics-track-link']")
    public static WebElement atmandbranch;

    public void clickatmandbranch() {
        atmandbranch.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atmandbranch.click();
    }

    @FindBy(how = How.CSS, using = "#firstFocusableElement")
    public static WebElement opennow;

    public void clickopennow() {
        opennow.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        opennow.click();
    }

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'https://sites.chase.com/content/services/structured-image/image.desktop.jpg/XCRT/Flexible-Templates/Triplets/2018/HomeFinance/52761_IC18-365_IconTrip_384x280_Desktop_FNL.jpg')]")
    public WebElement mortgage;

    public WebElement getMortgage() {

        return mortgage;
    }

    public void clickonMortgage() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMortgage().click();
    }

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'https://sites.chase.com/content/services/structured-image/image.desktop.jpg/XCRT/Flexible-Templates/Triplets/2018/HomeFinance/52761_IC18-365_IconTrip_384x280_Desktop_FNL.jpg')]")
    public WebElement Heretohelp;

    public WebElement getHeretohelp() {

        return Heretohelp;
    }

    public void clickOnHeretohelp() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getHeretohelp().click();
    }

    @FindBy(how = How.XPATH, using = "//img[@src='https://sites.chase.com/content/services/structured-image/image.desktop.jpg/XCRT/Flexible-Templates/Triplets/2018/HomeFinance/52761_IC18-365_IconTrip_384x280_Desktop_FNL.jpg']")
    public WebElement Firstthingsfirst;

    public WebElement getFirstthingsfirst() {

        return Firstthingsfirst;
    }

    public void clickOnFirstthingsfirst() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getFirstthingsfirst().click();
    }

    @FindBy(how = How.XPATH, using = "//img[@src='https://sites.chase.com/content/services/structured-image/image.desktop.jpg/XCRT/Flexible-Templates/Triplets/2019/Other/IC19-71_Gov_Shutdown_Triplet_FNL_DT_51900.jpg']")
    public WebElement Affectedbyshutdown;

    public WebElement getAffectedbyshutdown() {

        return Affectedbyshutdown;
    }

    public void clickOnAffectedbyshutdown() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAffectedbyshutdown().click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"DA_868165066932\"]/div[2]")
    public static WebElement Findarightcreditcard;

    public void clickFindarightcreditcard() {
        Findarightcreditcard.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Findarightcreditcard.click();

    }


    @FindBy(how = How.XPATH, using = "//*[@id=\"DA_80160785480\"]/a/div/div[1]/p")
    public static WebElement Limitedtimeoffer;

    public void clickLimitedtimeoffer() {
        Limitedtimeoffer.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Limitedtimeoffer.click();

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"DA_80160785480\"]/a/div/div[3]/div/div[2]/div/p")
    public static WebElement getstarted;

    public void clickgetstarted() {
        getstarted.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getstarted.click();

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"custom-pager__container-b\"]/div[1]/button")
    public static WebElement slide;

    public void clickslide() {
        slide.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        slide.click();


    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"custom-pager__container-b\"]/div[3]/button")
    public static WebElement slide1;

    public void clickslide1() {
        slide1.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        slide1.click();

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"DA_80160785480\"]/a/div/div[2]/img")
    public static WebElement get$200withactivities;

    public void clickget$200withactivities() {
        get$200withactivities.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        get$200withactivities.click();

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"DA_960998882560\"]/a/div/div[1]/p")
    public static WebElement depositingcheckseasier;

    public void clickdepositingcheckseasier() {
        depositingcheckseasier.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        depositingcheckseasier.click();

    }


    @FindBy(how = How.XPATH, using = "//*[@id=\"DA_307599687580\"]/a/div/div[1]/p")
    public static WebElement choosechasepay;

    public void clickchoosechasepay() {
        choosechasepay.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        choosechasepay.click();

    }


    @FindBy(how = How.XPATH, using = "//*[@id=\"DA_307599687580\"]/a/div/div[2]/img")
    public static WebElement paylogo;

    public void clickpaylogo() {
        paylogo.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        paylogo.click();

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"Module6\"]/div/div/div/div[3]/a")
    public static WebElement showmemore;

    public void clickshowmemore() {
        showmemore.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        showmemore.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/p/a[1]")
    public static WebElement checkingaccounts;

    public void clickcheckingaccounts() {
        checkingaccounts.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkingaccounts.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/p/a[2]")
    public static WebElement chasepremier;

    public void clickchasepremier() {
        chasepremier.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chasepremier.click();
    }


    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/p/a[3]")
    public static WebElement chasecoupon;

    public void clickchasecoupon() {
        chasecoupon.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chasecoupon.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[2]/p/a[1]")
    public static WebElement savingaccounts;

    public void clicksavingaccounts() {
        savingaccounts.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        savingaccounts.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[2]/p/a[2]")
    public static WebElement CDs;

    public void clickCDs() {
        CDs.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CDs.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div/div[2]/p/a[1]")
    public static WebElement chaseliquid;

    public void clickchaseliquid() {
        chaseliquid.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chaseliquid.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div/div[2]/p/a[2]")
    public static WebElement prepaidcard;

    public void clickprepaidcard() {
        prepaidcard.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        prepaidcard.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[4]/div/div[2]/p/a[1]")
    public static WebElement creditcards;

    public void clickcreditcards() {
        creditcards.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        creditcards.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[4]/div/div[2]/p/a[2]")
    public static WebElement cashback;

    public void clickcashback() {
        cashback.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cashback.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[4]/div/div[2]/p/a[4]")
    public static WebElement freecreditscore;

    public void clickfreecreditscore() {
        freecreditscore.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        freecreditscore.click();

    }

    @FindBy(how = How.XPATH, using = "/html/body/div/footer/div/div[2]/div/div/div[2]/div[1]/div/div[5]/div/div[2]/p/a[2]")
    public static WebElement refinance;

    public void clickrefinance() {
        refinance.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        refinance.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'mortgage calculator')]")
    public static WebElement mortgagecalculator;

    public void clickmortgagecalculator() {
        mortgagecalculator.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mortgagecalculator.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'applying for a mortgage')]")
    public static WebElement applyingformortgage;

    public void clickapplyingformortgage() {
        applyingformortgage.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        applyingformortgage.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Home Equity Line of Credit')]")
    public static WebElement homeequitylineofcredit;

    public void clickhomeequitylineofcredit() {
        homeequitylineofcredit.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeequitylineofcredit.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'HELOC calculator')]")
    public static WebElement heloccalculator;

    public void clickheloccalculator() {
        heloccalculator.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        heloccalculator.click();

    }

    @FindBy(how = How.XPATH, using = "//div[@class='seo-content parsys']//div[6]//div[1]//div[2]//p[1]//a[3]")
    public static WebElement beforeyouapply;

    public void clickbeforeyouapply() {
        beforeyouapply.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beforeyouapply.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Auto finance')]")
    public static WebElement autofinance;

    public void clickautofinance() {
        autofinance.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autofinance.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Chase Car Buying Service')]")
    public static WebElement chasecarbuyingservice;

    public void clickchasecarbuyingservice() {
        chasecarbuyingservice.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chasecarbuyingservice.click();

    }

    @FindBy(how = How.XPATH, using = "//div[@class='seo-content parsys']//div[7]//div[1]//div[2]//p[1]//a[3]")
    public static WebElement carloan;

    public void clickcarloan() {
        carloan.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        carloan.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'refinance car loan')]")
    public static WebElement refinancecarloan;

    public void clickrefinancecarloan() {
        refinancecarloan.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        refinancecarloan.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'auto loan calculator')]")
    public static WebElement autoloancalculator;

    public void clickautoloancalculator() {
        autoloancalculator.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoloancalculator.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'financial advisor')]")
    public static WebElement financialadvisor;

    public void clickfinancialadvisor() {
        financialadvisor.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        financialadvisor.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'invest online')]")
    public static WebElement investonline;

    public void clickinvestonline() {
        investonline.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        investonline.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Chase Private Client')]")
    public static WebElement chaseprivateclient;

    public void clickchaseprivateclient() {
        chaseprivateclient.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chaseprivateclient.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'concierge banking')]")
    public static WebElement conciergebanking;

    public void clickconciergebanking() {
        conciergebanking.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        conciergebanking.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Business Banking')]")
    public static WebElement businessbanking;

    public void clickbusinessbanking() {
        businessbanking.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        businessbanking.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'business credit cards')]")
    public static WebElement businesscreditcards;

    public void clickbusinesscreditcards() {
        businesscreditcards.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        businesscreditcards.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Chase online')]")
    public static WebElement chaseonline;

    public void clickchaseonline() {
        chaseonline.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chaseonline.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Chase customer service')]")
    public static WebElement chasecustomerservice;

    public void clickchasecustomerservice() {
        chasecustomerservice.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chasecustomerservice.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Chase complaints and feedback')]")
    public static WebElement chasecomplaintsandfeedback;

    public void clickchasecomplaintsandfeedback() {
        chasecomplaintsandfeedback.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chasecomplaintsandfeedback.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Chase Experiences')]")
    public static WebElement chaseexperience;

    public void clickchaseexperience() {
        chaseexperience.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chaseexperience.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Online Banking')]")
    public static WebElement onlinebanking;

    public void clickonlinebanking() {
        onlinebanking.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        onlinebanking.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Student Center')]")
    public static WebElement studentcenter;

    public void clickstudentcenter() {
        studentcenter.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        studentcenter.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Deposit and Prepaid Account Agreements')]")
    public static WebElement depositaccountagreement;

    public void clickdepositaccountagreement() {
        depositaccountagreement.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        depositaccountagreement.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Privacy')]")
    public static WebElement privacy;

    public void clickprivacy() {
        privacy.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacy.click();
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Security')]")
    public static WebElement security;

    public void clicksecurity() {
        security.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        security.click();
    }


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Accessibility')]")
    public static WebElement accessibility;

    public void clickaccessibility() {
        accessibility.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        accessibility.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Site map')]")
    public static WebElement sitemap;

    public void clicksitemap() {
        sitemap.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sitemap.click();

    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Help for homeowners')]")
    public static WebElement helpforhomeowners;

    public void clickhelpforhomeowners() {
       helpforhomeowners.click();
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
      helpforhomeowners.click();

    }

}


