package com.hsbc.steps.common;

import com.hsbc.steps.BestDigitalCamerasSteps;
import com.hsbc.steps.HomeSteps;
import com.hsbc.steps.ProductDetailsSteps;
import com.hsbc.steps.ShoppingCartSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class BaseStep {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public HomeSteps home;

    @Steps
    public BestDigitalCamerasSteps digitalCameras;

    @Steps
    public ProductDetailsSteps productDetails;

    @Steps
    public ShoppingCartSteps shoppingCart;
}
