package com.hsbc.steps;

import com.hsbc.pages.BestDigitalCamerasPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BestDigitalCamerasSteps extends ScenarioSteps {

    private BestDigitalCamerasPage onBestDigitalCamerasPage() {
        return getPages().get(BestDigitalCamerasPage.class);
    }

    @Step
    public void clickOnElement(int index){
        onBestDigitalCamerasPage().clickOnElementNumber(index);
    }
}
