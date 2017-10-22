package com.hsbc.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailsPage extends PageObject {

    @FindBy(id = "productTitle")
    private WebElementFacade productName;

    @FindBy(id = "priceblock_ourprice")
    private WebElementFacade price;

    @FindBy(id = "add-to-cart-button")
    private WebElementFacade addToChartButton;

    @FindBy(id = "siNoCoverage-announce")
    private WebElementFacade noThanksButton;

    @FindBy(id = "quantity")
    private WebElementFacade qtyDropDown;

    @FindBy(id = "a-popover-6")
    private WebElementFacade popupDialog;

    public void selectQty(int qty) {
        qtyDropDown.selectByVisibleText(String.valueOf(qty));
    }

    public double getPrice() {
        return Double.parseDouble(price.getText().substring(1, price.getText().length()));
    }

    public String getProductNameText() {
        return productName.getText();
    }

    public void clickOnAddToChartButton() {
        clickOn(addToChartButton);
    }

    public void clickNoThanksIfVisible() {
        waitFor(ExpectedConditions.visibilityOf(popupDialog)).$(noThanksButton).click();
    }
}
