package com.hsbc.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class BestDigitalCamerasPage extends PageObject {

    @FindBy(css = "#zg_centerListWrapper [class='p13n-sc-truncated-hyphen p13n-sc-truncated']")
    private List<WebElementFacade> productsList;

    public void clickOnElementNumber(int index) {
        productsList.get(index).click();
    }
}
