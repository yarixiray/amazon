package com.hsbc.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingCartPage extends PageObject {

    @FindBy(id = "sc-subtotal-amount-activecart")
    private WebElementFacade subTotalPrice;

    public double getSubTotalPrice() {
        return Double.parseDouble(subTotalPrice.getText().substring(1, subTotalPrice.getText().length()).replace(",", ""));
    }

    public boolean isProductExists(String name) {
        return $(String.format("//*[contains(text(),'%s')]", name)).isCurrentlyVisible();
    }


}
