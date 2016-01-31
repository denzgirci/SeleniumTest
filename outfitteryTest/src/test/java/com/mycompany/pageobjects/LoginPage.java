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
public class LoginPage {

    /**
     * Finds registration link on login page.
     */
    @FindBy(css = "div.col-lg-6.col-md-6.col-sm-6 strong")
    private WebElement registrationLink;

    /**
     * clicks registration link.
     */
    public final void clickRegistrationLink() {
        registrationLink.click();
    }

}
