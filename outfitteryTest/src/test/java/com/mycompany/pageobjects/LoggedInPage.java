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
public class LoggedInPage {

    /**
     * Finds logged in menu on logged in page.
     */
    @FindBy(id = "menuLoggedIn")
    private WebElement loggedinMenu;

    /**
     *
     * @return loggedinMenu
     */
    public WebElement getLoggedinMenuLink() {
        return loggedinMenu;
    }

}
