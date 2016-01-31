/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Denchik
 */
public class RegistrationPage {

    /**
     * Finds email element.
     */
    @FindBy(id = "email")
    private WebElement email;

    /**
     * Finds password element.
     */
    @FindBy(id = "password")
    private WebElement password;

    /**
     * Finds submit button.
     */
    @FindBy(id = "submit")
    private WebElement submitBtn;

    /**
     * Finds contry style picture.
     */
    @FindBy(css = "a[data-answer-value='country 5']")
    private WebElement countryStyle;

    /**
     * Finds casual style picture.
     */
    @FindBy(css = "a[data-answer-value='casual']")
    private WebElement casualStyle;

    /**
     * Finds desert boots style picture.
     */
    @FindBy(css = "a[data-answer-value='desert boots']")
    private WebElement desertBootsStyle;

    /**
     * Finds shorts style picture.
     */
    @FindBy(css = "a[data-answer-value='shorts']")
    private WebElement shortsStyle;

    /**
     * Finds ralphlauren brand picture.
     */
    @FindBy(css = "a[data-answer-value='ralphlauren']")
    private WebElement ralphLaurenBrand;

    /**
     * Finds age picture.
     */
    @FindBy(css = "a[data-answer-value='18-30']")
    private WebElement age;

    /**
     * Finds save time reason picture.
     */
    @FindBy(css = "a[data-answer-value='save time']")
    private WebElement saveTimeReason;

    /**
     * Finds continue button.
     */
    @FindBy(css = "a.btn-primary")
    private WebElement continueBtn;

    /**
     * @return email element
     */
    public WebElement getEmailField() {
        return email;
    }

    /**
     * @return desert boots style element
     */
    public WebElement getDesertBootsStyle() {
        return desertBootsStyle;
    }

    /**
     * @return shorts style element
     */
    public WebElement getShortsStyle() {
        return shortsStyle;
    }

    /**
     * @return ralphlauren brand element
     */
    public WebElement getRalphLaurenBrand() {
        return ralphLaurenBrand;
    }

    /**
     * @return age element
     */
    public WebElement getAge() {
        return age;
    }

    /**
     * @return country style element
     */
    public WebElement getCountryStyle() {
        return countryStyle;
    }

    /**
     * @return casual style element
     */
    public WebElement getCasualStyle() {
        return casualStyle;
    }

    /**
     * @return save time reason element
     */
    public WebElement getSaveTimeReason() {
        return saveTimeReason;
    }

    /**
     * Types and send credentials.
     *
     * @param username
     * @param pass
     */
    public final void typeCredentials(String username, String pass) {
        email.sendKeys(username);
        password.sendKeys(pass);
        submitBtn.click();

    }

    /**
     * Clicks continue button.
     */
    public final void clickContinueBtn() {
        continueBtn.click();
    }

    /**
     * Clicks questions pictures.
     *
     * @param element
     */
    public final void clickQuestionsPictures(WebElement element) {
        element.click();
        clickContinueBtn();
    }

}
