package com.hsbc.steps;

import com.hsbc.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSteps extends ScenarioSteps {

    private HomePage onHomePage() {
        return getPages().get(HomePage.class);
    }

    @Step
    public void clickOnCamerasSeeAllLink(){
        onHomePage().clickOnCamerasSeeAllLink();
    }

    @Step
    public void openHomePage(){
        onHomePage().open();
    }

    @Step
    public void clickOnCartLink(){
        onHomePage().clickOnCartLink();
    }
}
