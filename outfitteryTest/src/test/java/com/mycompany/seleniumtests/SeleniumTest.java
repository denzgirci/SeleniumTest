package com.mycompany.seleniumtests;

import com.mycompany.pageobjects.HomePage;
import com.mycompany.pageobjects.LoggedInPage;
import com.mycompany.pageobjects.LoginPage;
import com.mycompany.pageobjects.RegistrationPage;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Denchik
 */
public class SeleniumTest extends AbstractSeleniumTest {

    @Before
    public void before() {

        driver = new FirefoxDriver();
        openHomePageUrl();
        waitUntilTitleContains(HOME_PAGE_TITLE);
        driver.manage().deleteAllCookies();
        homePage = (PageFactory.initElements(driver, HomePage.class));
        loginPage = (PageFactory.initElements(driver, LoginPage.class));
        registrationPage = (PageFactory.initElements(driver, RegistrationPage.class));
        loggedInPage = (PageFactory.initElements(driver, LoggedInPage.class));

    }

    @After
    public void after() {

        driver.close();

    }

    /**
     * Checks successful registration.
     */
    @Test
    public final void checkRegistrationSuccessful() {

        homePage.clickLoginLink();
        waitUntilTitleContains(LOGIN_PAGE_TITLE);

        loginPage.clickRegistrationLink();
        waitUntilTitleContains(REGISTRATION_PAGE_TITLE);

        registrationPage.clickQuestionsPictures(registrationPage.getCountryStyle());
        waitUntilElementDisplayed(registrationPage.getCasualStyle());
        registrationPage.clickQuestionsPictures(registrationPage.getCasualStyle());
        waitUntilElementDisplayed(registrationPage.getDesertBootsStyle());
        registrationPage.clickQuestionsPictures(registrationPage.getDesertBootsStyle());
        waitUntilElementDisplayed(registrationPage.getShortsStyle());
        registrationPage.clickQuestionsPictures(registrationPage.getShortsStyle());
        waitUntilElementDisplayed(registrationPage.getRalphLaurenBrand());
        registrationPage.clickQuestionsPictures(registrationPage.getRalphLaurenBrand());
        waitUntilElementDisplayed(registrationPage.getAge());
        registrationPage.clickQuestionsPictures(registrationPage.getAge());
        waitUntilElementDisplayed(registrationPage.getSaveTimeReason());
        registrationPage.clickQuestionsPictures(registrationPage.getSaveTimeReason());

        waitUntilElementDisplayed(registrationPage.getEmailField());
        registrationPage.typeCredentials(createRandomUser(), CORRECT_PASSWORD);

        waitUntilElementDisplayed(loggedInPage.getLoggedinMenuLink());
        assertEquals(LOGGEDIN_LINK_TEXT, loggedInPage.getLoggedinMenuLink().getText());

    }

}
