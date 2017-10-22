package com.hsbc.steps;

import com.hsbc.model.Product;
import com.hsbc.pages.ShoppingCartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.hsbc.steps.ProductDetailsSteps.productList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingCartSteps extends ScenarioSteps {

    private ShoppingCartPage onShoppingCartPage() {
        return getPages().get(ShoppingCartPage.class);
    }

    @Step
    public void verifySubTotalPrice() {
        double subtotal = 0.0;
        for (Product product : productList) {
            subtotal += product.getSubTotalPrice();
        }
        assertEquals(onShoppingCartPage().getSubTotalPrice(), subtotal);
    }

    @Step
    public void isProductPresentInTheCart() {
        for (Product product : productList) {
            assertTrue(onShoppingCartPage().isProductExists(product.getName()));
        }
    }
}
