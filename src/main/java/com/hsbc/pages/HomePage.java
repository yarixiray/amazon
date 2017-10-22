package com.hsbc.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.amazon.com")
public class HomePage extends PageObject {

    @FindBy(css = "a[href*='bestsellers']")
    private WebElementFacade camerasSeeAllLink;

    @FindBy(id = "nav-cart")
    private WebElementFacade cartLink;

    public void clickOnCartLink() {
        clickOn(cartLink);
    }

    public void clickOnCamerasSeeAllLink() {
        clickOn(camerasSeeAllLink);
    }

}
