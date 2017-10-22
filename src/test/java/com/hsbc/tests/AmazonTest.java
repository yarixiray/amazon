package com.hsbc.tests;

import com.hsbc.steps.common.BaseStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AmazonTest extends BaseStep {
    @Test
    public void amazonTest() {
        home.openHomePage();
        home.clickOnCamerasSeeAllLink();
        digitalCameras.clickOnElement(5);
        productDetails.addProductToCard(8);
        home.clickOnCartLink();
        shoppingCart.verifySubTotalPrice();
        shoppingCart.isProductPresentInTheCart();
    }
}
