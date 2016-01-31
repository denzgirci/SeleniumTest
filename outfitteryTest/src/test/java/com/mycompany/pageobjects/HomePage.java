package com.mycompany.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Denchik
 */
public class HomePage {

    /**
     * find login link on home page.
     */
    @FindBy(css = "a.login.open-login")
    private WebElement loginLink;

    /**
     * clicks login link on home page.
     */
    public final void clickLoginLink() {
        loginLink.click();
    }

}
