package com.hsbc.steps;

import com.hsbc.model.Product;
import com.hsbc.pages.ProductDetailsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsSteps extends ScenarioSteps {

    private ProductDetailsPage onProductDetailsPage() {
        return getPages().get(ProductDetailsPage.class);
    }

    public static List<Product> productList = new ArrayList<Product>();

    @Step
    public void addProductToCard(int qty) {
        productList.add(
                new Product(
                        onProductDetailsPage().getPrice(),
                        onProductDetailsPage().getProductNameText(),
                        qty));
        onProductDetailsPage().selectQty(qty);
        onProductDetailsPage().clickOnAddToChartButton();
        onProductDetailsPage().clickNoThanksIfVisible();
    }
}
