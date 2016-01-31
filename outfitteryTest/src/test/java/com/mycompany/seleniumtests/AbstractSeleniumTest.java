package com.mycompany.seleniumtests;

import com.mycompany.pageobjects.HomePage;
import com.mycompany.pageobjects.LoggedInPage;
import com.mycompany.pageobjects.LoginPage;
import com.mycompany.pageobjects.RegistrationPage;
import java.util.UUID;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Denchik
 */
public abstract class AbstractSeleniumTest {

    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;
    LoggedInPage loggedInPage;

    public WebDriver driver;

    private final String url = "https://www.outfittery.de";

    public static String HOME_PAGE_TITLE = "OUTFITTERY - Shopping für Männer";
    public static String LOGIN_PAGE_TITLE = "Login";
    public static String REGISTRATION_PAGE_TITLE = "Fragebogen";
    public static String CORRECT_PASSWORD = "123456789A";
    public static String LOGGEDIN_LINK_TEXT = "Herr Outfittery Gentleman";

    public final void openHomePageUrl() {
        driver.get(url);
    }

    /**
     * Waits until the page contains required title.
     *
     * @param title
     */
    public final void waitUntilTitleContains(String title) {
        WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 15)
                .ignoring(StaleElementReferenceException.class);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {

                return driver.getTitle().contains(title);
            }
        });
    }

    /**
     * Waits until required element is displayed.
     *
     * @param element
     */
    public final void waitUntilElementDisplayed(WebElement element) {
        WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 15)
                .ignoring(StaleElementReferenceException.class);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {

                return element.isDisplayed();
            }
        });
    }

    /**
     * Creats an random user/email.
     *
     * @return user
     */
    public final String createRandomUser() {

        String user = UUID.randomUUID().toString() + "@byom.de";

        return user;

    }

}
